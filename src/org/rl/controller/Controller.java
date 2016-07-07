package org.rl.controller;

import org.rl.model.Creature;

public class Controller {

	public static void move(Creature creature, String direction) {
		switch (direction) {
		case "up":
			creature.moveUp();
			break;
		case "down":
			creature.moveDown();
			break;
		case "left":
			creature.moveLeft();
			break;
		case "right":
			creature.moveRight();
			break;
		}
		
	}

}
