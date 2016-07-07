package org.rl.main;

import org.rl.controller.Controller;
import org.rl.model.Creature;
import org.rl.model.MapModel;
import org.rl.view.GameFrame;

public class App {

	public static MapModel MAP = new MapModel();
	
	
	public static void main(String[] args) {
		Creature creature = new Creature(10, 2);
		
		creature.setXY(5, 5);
		creature.setSign('@');
		
		
		MAP.setCreatureOnMap(creature);
		Controller.move(creature, "up");

		MAP.setCreatureOnMap(creature);
		
		new GameFrame();
		
	}

}
