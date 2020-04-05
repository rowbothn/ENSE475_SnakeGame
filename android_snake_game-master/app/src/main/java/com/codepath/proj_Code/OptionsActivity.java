package com.codepath.proj_Code;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.os.Bundle;
import com.codepath.examples.basicsnakegame.R;
import com.codepath.examples.basicsnakegame.SnakeActor;
import com.codepath.examples.basicsnakegame.SnakeGameActivity;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class OptionsActivity extends Activity implements OnItemSelectedListener
{
    GameSettingsViewModel model;

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        model.selectedItem = (String) parent.getItemAtPosition(pos);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.options_menu);

        if (model == null)
            model = new GameSettingsViewModel();

        Spinner spinner = (Spinner) findViewById(R.id.difficultySpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.difficulty_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        if (model.selectedItem != null)
            spinner.setSelection(adapter.getPosition(model.selectedItem));

        Button saveBtn = (Button) findViewById(R.id.saveButton);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int step = SnakeActor.STEP;

                if (model.selectedItem.equals("Easy"))
                    step = 25;
                if (model.selectedItem.equals("Medium"))
                    step = 45;
                if (model.selectedItem.equals("Hard"))
                    step = 52;

                SnakeActor.STEP = step;

                finish();
            }
        });

        Button cancelBtn = (Button) findViewById(R.id.cancelButton);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
