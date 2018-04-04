import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.*;

public class StartGame {
	static JFrame frame;
	public static final int FRAME_HEIGHT = 720;
	public static final int FRAME_WIDTH = 1080;
	
	public static void main(String[] args) {
		// TODO open loading screen and start menu
		
		//initiate frame for UI
		openFrame();
		
		//create and display start panel
		drawStartScreen();
		
		//TODO: Finish Game
	}
	
	private static void openFrame() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Display the window.
        //frame.pack();
        frame.setVisible(true);
	}
	
	private static void drawStartScreen() {
		
		GamePanel gamePanel = new GamePanel();
		Panel panel = gamePanel.panel;
		frame.add(panel);
		
	}
}
