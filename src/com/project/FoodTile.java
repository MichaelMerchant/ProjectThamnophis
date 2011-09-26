package com.project;

import android.content.res.Resources;
import android.graphics.Bitmap;

/**
 * 
 * @author Kaushik
 *
 *Stores the basic tile information for Food.
 */
public class FoodTile extends AbstractTile
{
	private static Bitmap FOOD_TILE;
	
	static {
		//TODO Initialize FOOD_TILE
	}
	private boolean hasBeenEaten;
	
	public FoodTile () {
		hasBeenEaten = false;
	}
	
	public boolean update()
	{
		return !hasBeenEaten;
	}

	
	public Bitmap image() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void loadResources(Resources r) {
		// TODO Auto-generated method stub
		
	}

}
