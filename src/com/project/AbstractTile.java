package com.project;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/**
 * The AbstractTile class is used for any object that will be drawn on the screen.
 * All objects are not permanent, so when updates occur, they may require the object to be destroyed.
 */
public abstract class AbstractTile 
{
	
	/**
	 * Updates the characteristics of any tile.
	 * 
	 * @return false if this tile is to be destroyed, true otherwise.
	 */
	public abstract boolean update();
	
	/**
	 * Method to request the image that this tile uses
	 * to represent itself when displayed on the screen.
	 * 
	 * @return A bitmap image representing the tile.
	 */
	public abstract Bitmap image();
	
	protected final Bitmap loadTile(Drawable img) {
		Bitmap bitmap = Bitmap.createBitmap(Constants.TILE_SIZE, Constants.TILE_SIZE, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        img.setBounds(0, 0, Constants.TILE_SIZE, Constants.TILE_SIZE);
        img.draw(canvas);
        
        return bitmap;
	}
	
}