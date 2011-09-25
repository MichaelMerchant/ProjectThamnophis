package com.project;


//Even though the snake as a whole represents 3 or more tiles, it must contain
//an update method and a tile position so it is considered a CharacterTile.
//The snake will contain Three fields a snakeHead, a snakeBody, and a
//snakeTail. The snakeHead will contain the position of itself as well as its
//current direction. The snakeBody will contain a counter. When the counter
//drops to LAST_BODY_TILE, it will be replaced by the tail. The tail will
//disappear, or change back into a BlankTile.
//NOTE: THERE MUST BE A WAY FOR THE TAIL TO DETERMINE ITS OWN DIRECTION.
public class SnakeHeadTile implements CharacterTile
{

	// snakeHeadPosition is a private field in which it stores the current
	// position of the SnakeHead.
	private Tile[][] snakeHeadPosition;
	
	// headDirection is a private field in which it stores the current
	// string of the direction of the snakeHead.
	private String snakeHeadDirection;

	
	// This constructor is made in order to create a characterTile
	// of the SnakeHead. This snake head will contain an update method similar
	// to the other tiles but when this head update it will move it self 
	// upward by one in the direction it is facing. The SnakeHead will also
	// contain its own snakeHeadPosition, which stores the current position of
	// the head, and snakeHeadDirection which determines the direction the
	// snake is pointing.
	public SnakeHeadTile(Tile[][] snakeHeadPosition)
	{
		this.snakeHeadPosition = snakeHeadPosition;
		this.snakeHeadDirection = TileDirection.setEast();
	}

	
	// This method will return the snakehead position.
	public Tile[][] getCharacterAtACertainPosition()
	{
			
		return snakeHeadPosition;
	}

	
	// This method set the direction of the head to equal West. If the
	// direction of the head is East, nothing will happen however.
	public void MoveWest()
	{
		if (!snakeHeadDirection.equals(TileDirection.setEast()))
		{
			this.snakeHeadDirection = TileDirection.setWest();
		}
	}
	
	
	// This method set the direction of the head to equal East. If the
	// direction of the head is West, nothing will happen however.
	public void MoveEast()
	{
		if (!snakeHeadDirection.equals(TileDirection.setWest()))
		{
			this.snakeHeadDirection = TileDirection.setEast();
		}
	}
	
	
	// This method set the direction of the head to equal North. If the
	// direction of the head is South, nothing will happen however.
	public void MoveNorth()
	{
		if (!snakeHeadDirection.equals(TileDirection.setSouth()))
		{
			this.snakeHeadDirection = TileDirection.setNorth();
		}
	}
	
	
	// This method set the direction of the head to equal South. If the
	// direction of the head is North, nothing will happen however.
	public void MoveSouth()
	{
		if (!snakeHeadDirection.equals(TileDirection.setNorth()))
		{
			this.snakeHeadDirection = TileDirection.setSouth();
		}
	}
		
	
	// This method will update the head by moving it one position forward from
	// the direction it is facing. This Snake will throw an crash exception if
	// it crashes into itself or the frame.
	public void upDate()
	{
		if (snakeHeadDirection.equals(TileDirection.setNorth()))
		{
			
		}
		else if (snakeHeadDirection.equals(TileDirection.setWest()))
		{
			
		}
		else if (snakeHeadDirection.equals(TileDirection.setSouth()))
		{
			
		}
		else
		{
			
		}
	}
}
