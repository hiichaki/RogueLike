package org.rl.view;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7187285659542141557L;

	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(100, 100, 20, 50);
		
	}

}