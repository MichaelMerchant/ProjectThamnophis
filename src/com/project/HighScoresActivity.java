package com.project;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class HighScoresActivity extends Activity{
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.highscores);
        
		//	requestWindowFeature(Window.FEATURE_NO_TITLE);
		// For some reason, asking it to do this in any activity other than the main one makes it force close

		// Force application full screen.
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		Constants.WINDOW_HEIGHT = getWindowManager().getDefaultDisplay()
				.getHeight();
		Constants.WINDOW_WIDTH = getWindowManager().getDefaultDisplay()
				.getWidth();
	}
}
