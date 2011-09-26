package com.project;

/**
 * @author Kaushik
 *
 * All game objects are entities that must be updated at every frame.
 * The return value may be used for testing completion as well as other things.
 */
public interface Entity {
	public boolean update();
}
