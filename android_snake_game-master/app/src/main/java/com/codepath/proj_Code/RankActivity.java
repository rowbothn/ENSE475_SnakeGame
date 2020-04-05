package com.codepath.proj_Code;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.codepath.examples.basicsnakegame.R;

public class RankActivity extends Activity implements AdapterView.OnItemSelectedListener {
    GameSettingsViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.rank_menu);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        model.selectedItem = (String) parent.getItemAtPosition(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Antoher Interface callback
    }
}
