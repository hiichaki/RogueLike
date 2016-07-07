package org.rl.model;

public class MapModel {
	private int size = 15;
	private Cell[][] map = new Cell[size][size];

	public MapModel() {
		
		for (int i = 1; i < map.length - 1; ++i) {
			map[i] = new Cell[map.length];
			for (int j = 1; j < map.length - 1; ++j) {
				map[i][j] = new Cell();
				map[i][j].setSign('.');
			}
		}

		for (int i = 0; i < map.length; ++i) {
			map[0][i] = new Cell();
			map[0][i].setSign('#');
			
			map[i][0] = new Cell();
			map[i][0].setSign('#');
			
			map[map.length - 1][i] = new Cell();
			map[map.length - 1][i].setSign('#');
			
			map[i][map.length - 1] = new Cell();
			map[i][map.length - 1].setSign('#');
		}
		
	}


	public void setCreatureOnMap(Creature creature) {
		map[creature.getX()][creature.getY()].setSign(creature.getSign());
		print();
		System.out.println("______________________");
		System.out.println("x:" + creature.getX() + " y:" + creature.getY());

	}

	public void print() {
		for (Cell row[] : map) {
			for (Cell cell : row) {
				System.out.print(cell);
			}
			System.out.println("");
		}
	}

	public boolean isEmpty(int x, int y) {
		if (map[x][y].getSign() == '#') {
			return false;
		} else {
			return true;
		}

	}

}
