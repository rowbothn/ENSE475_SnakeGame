package com.codepath.proj_Code;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.app.Activity;

import com.codepath.examples.basicsnakegame.R;
import com.codepath.examples.basicsnakegame.SnakeGameActivity;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //before activity is created : cold start
        //switch back to original Theme (App Theme)
        setTheme(R.style.AppTheme);

        //switchFullscreen();
        setContentView(R.layout.start_menu);
        //setContentView(new SnakeGamePanel(this));

        Button button = (Button) findViewById(R.id.startButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SnakeGameActivity.class);
                startActivity(intent);
            }
        });
    }
}
