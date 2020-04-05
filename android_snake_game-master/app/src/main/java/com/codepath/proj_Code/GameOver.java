package com.codepath.proj_Code;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codepath.examples.basicsnakegame.R;
import com.codepath.examples.basicsnakegame.SnakeGameActivity;

public class GameOver extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.AppTheme);

        //switchFullscreen();
        setContentView(R.layout.start_menu);
        //setContentView(new SnakeGamePanel(this));

        Button button = (Button) findViewById(R.id.Retry);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(GameOver.this, MainActivity.class);
                startActivity(startIntent);
            }
        });


    }
}
