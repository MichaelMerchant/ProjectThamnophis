package game.thamnophis;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;


public class ThamnophisActivity extends Activity {

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

		// Set the graphics view as the main content view.
		// Note that R.layout.main is now no longer used..

		setContentView(R.layout.main);
	}
}