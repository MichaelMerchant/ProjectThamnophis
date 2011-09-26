package com.project;

public class Snake implements Entity {
	private Position headLoc;
	private Direction dir;

	
	public Snake (Position initialLocation, Direction initialDirection) {
		headLoc = initialLocation;
		dir = initialDirection;
	}
	
	public boolean update() {
		return true;
	}
}
