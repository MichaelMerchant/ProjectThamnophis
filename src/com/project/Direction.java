package com.project;

public enum Direction {
	NORTH, EAST, SOUTH, WEST;
	
	public Direction rotateBy(Rotation rot) {
		if (this == NORTH)
		{
			return rot == Rotation.CLOCKWISE ? EAST : WEST;
		}
		else if (this == EAST)
		{
			return rot == Rotation.CLOCKWISE ? SOUTH : NORTH;
		}
		else if (this == SOUTH)
		{
			return rot == Rotation.CLOCKWISE ? WEST : EAST;
		}
		else
		{
			return rot == Rotation.CLOCKWISE ? NORTH : SOUTH;
		}
	}
}
