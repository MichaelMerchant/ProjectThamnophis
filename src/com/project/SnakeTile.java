package com.project;

import android.content.res.Resources;
import android.graphics.Bitmap;

/**
 *
 */
public class SnakeTile extends AbstractTile
{
	/*
	 * Constants:
	 *
	 * HEAD_TILE:
	 *	Stores the image of the head tile.
	 * BODY_TILE:
	 *	Stores the image of the body tile.
	 * TAIL_TILE:
	 *	Stores the image of the tail tile.
	 */
	
	private static Bitmap HEAD_TILE, BODY_TILE, TAIL_TILE;
	
	/*
	 * Initializes the static tile variables:
	 */
	
	/*
	 * Fields:
	 * 
	 * initialCount:
	 *	Stores the number of frames this tile will exist before it is removed.
	 * currentCount:
	 *  Store the number of frames left until this tile is removed.
	 */
	
	private int initialCount;
	private int currentCount;
	
	/**
	 * Constructs a tile which will exist for a given amount of time, measured in number of frames.
	 */
	public SnakeTile(int lifeTime)
	{
		currentCount = lifeTime;
		initialCount = lifeTime;
	}
	
	/**
	 * Updates the 
	 * 
	 * @return false if object is to be destroyed, true otherwise.
	 */
	public boolean update()
	{
		if (currentCount == 0)
			return false;
		currentCount--;
		return true;
	}
	
	public Bitmap image()
	{
		int c = currentCount;
		return c == initialCount ? HEAD_TILE : c == 0 ? TAIL_TILE : BODY_TILE;
	}

	public static void loadResources(Resources r) {
		/*
		HEAD_TILE = loadTile(r.getDrawable(R.drawable.snake_head));
		BODY_TILE = loadTile(r.getDrawable(R.drawable.snake_body));
		TAIL_TILE = loadTile(r.getDrawable(R.drawable.snake_tail));
		*/
	}
}
