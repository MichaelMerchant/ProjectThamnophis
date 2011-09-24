package com.project;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;

public class GameView extends SurfaceView implements Callback {
	
	
	public GameView (Context context) {
		super(context);
	}

	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		
	}
	
	//This is an initializer
	public void surfaceCreated(SurfaceHolder arg0) {
		
	}

	public void surfaceDestroyed(SurfaceHolder holder) {

	}
	
	protected void onDraw (Canvas c) {
		
	}
	
	public boolean onTouchEvent(MotionEvent event) {
	      float currentX = event.getX();
	      float currentY = event.getY();

	      System.out.println("X: " + currentX);
	      System.out.println("Y: " + currentY);

	      return true;  // Event handled
	   }
}
