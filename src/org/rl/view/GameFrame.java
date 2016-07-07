package org.rl.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3149329263921547568L;

	private Canvas canvas = new Canvas();
	
	public GameFrame() {
		setVisible(true);
		setSize(800, 600);

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);

		setLocation(x, y);
		setResizable(false);
		
		getContentPane().add(canvas);

	}

}
