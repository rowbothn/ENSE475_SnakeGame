package com.codepath.proj_Code;

import android.os.Bundle;
import com.codepath.examples.basicsnakegame.R;
import android.app.Activity;

public class OptionsActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.options_menu);
    }
}
