package com.project;


//Even though the snake as a whole represents 3 or more tiles, it must contain
//an update method and a tile position so it is considered a CharacterTile.
//The snake will contain Three fields a snakeHead, a snakeBody, and a
//snakeTail. The snakeHead will contain the position of itself as well as its
//current direction. The snakeBody will contain a counter. When the counter
//drops to LAST_BODY_TILE, it will be replaced by the tail. The tail will
//disappear, or change back into a BlankTile.
//NOTE: THERE MUST BE A WAY FOR THE TAIL TO DETERMINE ITS OWN DIRECTION.
public class SnakeBodyTile implements CharacterTile
{
	// This field will contain the count of the SnakeBodyTile.
	// When the count of the SnakeBodyTile reach LAST_BODY_TILE, That means that the Tile is
	// adjacent to the tail. This Tile will change into the SnakeTailTile to
	// represent movement.
	private int countBeforeLastBodyTile;
	
	
	// This constant represents the snakeBodyTile adjacent to the tail or the
	// last snakeBodyTile.
	public static final int LAST_BODY_TILE = 0;

	
	// A constructor for the snake body tile. This constructor must take in a
	// number that is adjusted based on the number of snake bodies that exist.
	// This number will be decremented at update. If it reach LAST_BODY_TILE, then at update
	// it will change into a tail.
	// NOTE: THE COUNTBEFORELASTBODYTILE MUST BE ADDED TO AND SET INTO THE
	// SNAKE UPON CREATION MUST BE HANDLED BY THE GAME SYSTEM ITSELF.
	public SnakeBodyTile(int countBeforeLastBodyTile)
	{
		this.countBeforeLastBodyTile = countBeforeLastBodyTile;
	}
	
	
	// This method does absolutely nothing for this tile. But this method must 
	// be made for the other tiles to know its own location. 
	// NOTE: THE SYSTEM MUST HANDLE THE NULL EXCEPTION THAT IS RETURNED.
	public Tile[][] getCharacterAtACertainPosition()
	{
		return null;
	}
	
	
	// Represent a change in motion of the Snake as a whole. This method for
	// this particular snakeBodyTile will start with an if-statement.
	// If the countBeforeLastBodyTile is LAST_BODY_TILE than a new tail will be formed in
	// this position. Else, decrement the snakeBodyTile's countBeforeLastBodyTile.
	public void upDate()
	{
		if (countBeforeLastBodyTile == LAST_BODY_TILE)
		{
			
		}
		else
		{
			countBeforeLastBodyTile--;
		}
	}

}
