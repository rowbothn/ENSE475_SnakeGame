package com.codepath.proj_Code;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codepath.examples.basicsnakegame.R;
import com.codepath.examples.basicsnakegame.SnakeGameActivity;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.AppTheme);

        //switchFullscreen();
        setContentView(R.layout.start_menu);
        //setContentView(new SnakeGamePanel(this));

        Button button = (Button) findViewById(R.id.startButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainActivity.this, SnakeGameActivity.class);
                startActivity(startIntent);
            }
        });

        Button optionsBtn = (Button) findViewById(R.id.optionButton);
        optionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent optionsIntent = new Intent(MainActivity.this, OptionsActivity.class);
                startActivity(optionsIntent);
            }
        });

        Button rankBtn = (Button) findViewById(R.id.rankButton);
        rankBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rankIntent = new Intent(MainActivity.this, RankActivity.class);
                startActivity(rankIntent);
            }
        });
    }
}
