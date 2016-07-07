package org.rl.model;

public class GameObject {

	private int x;
	private int y;
	private char sign;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
