package com.project;

// An interface class which is one of several
// square spaces on the board. This Class was made in order to represent
// all possible Tiles that could enter the board such as Snake, 
// StationaryEnemy, MovingEnemy, TopFrame, BottomeFrame, BlankTile, and Food.
// NOTE: FOOD IS MADE OF SEVERAL DIFFERENT CLASSES TO MATCH SEVERAL
// DIFFERENT CHARACTERISTICS.
// NOTE: MOVINGENEMY WILL NOT BE IMPLEMENTED UNTIL LATER.
public interface CharacterTile
{		
	// This method will return the characterTiles position.
	public Tile[][] getCharacterAtACertainPosition();
	
	
	// This method will change the position of the characterTile
	// by moving it at an adjacent vertical or horizontal tile.
	// The movement of each characterTile varies depending on the Class.
	// While updating the characterTile all except the EnemyTile must
	// determine if a crash has been made.
	// NOTE: THIS METHOD COULD BE ALSO USED TO CHANGE A SPECIFIC TILE
	// ON THE FIELD TO AN ENTIRELY NEW TILE.
	public void upDate();
}
