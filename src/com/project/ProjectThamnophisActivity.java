package com.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class ProjectThamnophisActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
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
        
        View b = findViewById(R.id.button0);
        b.setVisibility(View.INVISIBLE);
        View c = findViewById(R.id.button5);
        c.setVisibility(View.INVISIBLE); 
        
        final Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Start the game!
            }
        });
        final Button help = (Button) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Switch to the instructions activity
            	 Intent myIntent1 = new Intent(v.getContext(), InstructionsActivity.class);
           //      startActivityForResult(myIntent, 0);
            	 startActivity(myIntent1);
            }
        });
        final Button highScores = (Button) findViewById(R.id.highScores);
        highScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Switch to the high scores activity
            	Intent myIntent2 = new Intent(v.getContext(), ScoresActivity.class);
         //       startActivityForResult(myIntent, 0);
            	startActivity(myIntent2);
            }
        });
        final Button credits = (Button) findViewById(R.id.credits);
        credits.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Switch to the credits activity
            	Intent myIntent3 = new Intent(v.getContext(), CreditsActivity.class);
            //    startActivityForResult(myIntent, 0);
            	startActivity(myIntent3);
            }
        });
        
    }
}