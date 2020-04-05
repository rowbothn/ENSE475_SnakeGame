package com.codepath.examples.basicsnakegame;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class SnakeGameActivity extends com.codepath.GameActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//before activity is created : cold start
        //switch back to original Theme (App Theme)
        setTheme(R.style.AppTheme);

		switchFullscreen();
		setContentView(new SnakeGamePanel(this));
	}

//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		if (keyCode == KeyEvent.KEYCODE_P)
//		{
//			startActivity(new Intent(SnakeGameActivity.this, PauseWindow.class));
//		}
//		return true;
//	}
}
