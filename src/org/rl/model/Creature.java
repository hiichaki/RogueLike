package org.rl.model;

import org.rl.main.App;

public class Creature extends GameObject {

	private int hp;
	private int damage;

	public Creature(int hp, int damage) {
		this.hp = hp;
		this.damage = damage;
		this.setSign(' ');
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void moveUp() {
		if (App.MAP.isEmpty(this.getX() - 1, this.getY())) {
			this.setX(this.getX() - 1);
		}

	}

	public void moveDown() {
		if (App.MAP.isEmpty(this.getX() + 1, this.getY())) {
			this.setX(this.getX() + 1);
		}
		
	}

	public void moveRight() {
		if (App.MAP.isEmpty(this.getX(), this.getY() + 1)) {
			this.setY(this.getY() + 1);
		}
		
	}

	public void moveLeft() {
		if (App.MAP.isEmpty(this.getX(), this.getY() - 1)) {
			this.setY(this.getY() - 1);
		}
		
	}

}
