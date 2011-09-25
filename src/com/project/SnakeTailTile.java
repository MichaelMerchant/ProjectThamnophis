package com.project;


// Even though the snake as a whole represents 3 or more tiles, it must contain
// an update method and a tile position so it is considered a CharacterTile.
// The snake will contain Three fields a snakeHead, a snakeBody, and a
// snakeTail. The snakeHead will contain the position of itself as well as its
// current direction. The snakeBody will contain a counter. When the counter
// drops to LAST_BODY_TILE, it will be replaced by the tail. The tail will
// disappear, or change back into a BlankTile.
// NOTE: THERE MUST BE A WAY FOR THE TAIL TO DETERMINE ITS OWN DIRECTION.
public class SnakeTailTile implements CharacterTile
{
	// tailDirection is a private field in which it stores the current
	// string of the direction of the snakeTail.
	@SuppressWarnings("unused")
	private String snakeTailDirection;

	
	// This constructor is made in order to create a characterTile
	// of the SnakeTail. The snake Tail will delete itself at every update.
	// snakeTailDirection which determines the direction the
	// snakeTail is pointing.
	// NOTE: THE DIRECTION IN WHICH THE TAIL IS MOVING MUST BE SET.
	public SnakeTailTile(String snakeTailDirection)
	{
		this.snakeTailDirection = snakeTailDirection;
	}

	
	// This method does absolutely nothing for this tile. But this method must 
	// be made for the other tiles to know its own location. 
	// NOTE: THE SYSTEM MUST HANDLE THE NULL EXCEPTION THAT IS RETURNED.
	public Tile[][] getCharacterAtACertainPosition()
	{
			
		return null;
	}
		
	
	// This method will represent the movement of snakeTail by removing it all
	// together.
	public void upDate()
	{
		
	}
}
