package com.project;

public class Position {
	
	private int r;
	private int c;
	
	public Position(int row, int col) {
		r = row;
		c = col;
	}
	
	public Position stepInDirection(Direction dir) {
		int dr = dir == Direction.NORTH ? -1 : dir == Direction.SOUTH ? 1 : 0;
		int dc = dir == Direction.WEST ? -1 : dir == Direction.EAST ? 1 : 0;
		
		return new Position (r + dr, c + dc);
	}
}
