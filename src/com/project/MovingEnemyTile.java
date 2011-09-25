package com.project;


// This class is made to represent a general version of every type of 
// enemies with the ability to move around in the board. The exception in which
// the enemy crashes into the snake will be handled somewhere else.
public class MovingEnemyTile implements CharacterTile
{
	// movingEnemyPosition is a private field in which it stores the current
	// position of the movingEnemy.
	private Tile[][] movingEnemyPosition;
	
	
	// snakeHeadPosition is a private field in which it stores the current
	// position of the SnakeHead.
	@SuppressWarnings("unused")
	private Tile[][] snakeHeadPosition;

	
	// This constructor is made in order to create a characterTile
	// of the MovingEnemy. This MovingEnemy will contain an update method 
	// similar to the other tiles but when this MovingEnemy update it will
	// move it self to a new adjacent square based on the position of the 
	// snake and the Artificial Intelligence. Crashes that are made by the
	// enemy will be handled somewhere else. The MovingEnemy will also
	// contain its own movingEnemyPosition, which stores the current position 
	// of the enemy.
	public MovingEnemyTile(Tile[][] snakeHeadPosition, Tile[][] movingEnemyPosition)
	{
		this.movingEnemyPosition = movingEnemyPosition;
		this.snakeHeadPosition = snakeHeadPosition;
	}

	
	// This method will return the movingEnemy position.
	public Tile[][] getCharacterAtACertainPosition()
	{
		return movingEnemyPosition;
	}
		
	
	// This method will simulate movement of the enemy by deleting the
	// current moving enemy and creating an entirely new one at an adjacent
	// square. The position of the square in which the enemy moves will be
	// based on the position of the snake.
	// If the snake is directly above below left or right of the enemy then
	// the enemy will only move that direction, but if the snake is below and
	// to the left of the enemy then the enemy will make a random decision of 
	// whether to go left or down. This style of movement will hold true for
	// right and up, right and down, left and down, and left and up.
	public void upDate()
	{
		
	}
}
