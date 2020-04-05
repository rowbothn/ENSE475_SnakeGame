package com.codepath.proj_Code;

import android.app.Activity;
import android.os.Bundle;

import com.codepath.examples.basicsnakegame.R;

public class RankActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.rank_menu);

    }
}
