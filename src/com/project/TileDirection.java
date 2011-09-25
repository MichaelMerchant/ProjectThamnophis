package com.project;


// This class is used seperately from other classes so that that class can
// determine which direction it will be on. The only classes that should be
// able to use this class are the Tile Classes.
public class TileDirection
{
	// A representation of down in the game.
	private static final String SOUTH = "SOUTH";
	
	
	// A representation of up in the game.
	private static final String NORTH = "NORTH";
	
	
	// A representation of left in the game.
	private static final String WEST = "WEST";

	
	// A representation of right in the game.
	private static final String EAST = "EAST";


	// returns the field EAST.
	public static String setEast()
	{
		return EAST;
	}
	
	
	// returns the field WEST.
	public static String setWest()
	{
		return WEST;
	}
	
	
	// returns the field NORTH.
	public static String setNorth()
	{
		return NORTH;
	}
	
	
	// returns the field SOUTH.
	public static String setSouth()
	{
		return SOUTH;
	}
}
