package com.project;

import com.project.Constants;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class ProjectThamnophisActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Get rid of the application title bar.
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		// Force application full screen.
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		Constants.WINDOW_HEIGHT = getWindowManager().getDefaultDisplay()
				.getHeight();
		Constants.WINDOW_WIDTH = getWindowManager().getDefaultDisplay()
				.getWidth();

		
		Log.d("Main", "screen dimensions: " + Constants.WINDOW_WIDTH + ", "
				+ Constants.WINDOW_HEIGHT);
		
        setContentView(R.layout.main);
    }
}