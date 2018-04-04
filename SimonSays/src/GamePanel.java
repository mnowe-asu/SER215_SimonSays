import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.*;

public class GamePanel {
	Panel panel = new Panel();
	Label highScore = new Label();
	Label currentScore = new Label();
	Button mainMenu = new Button();
	
	GamePanel() {
		setHighScore();
	}
	
	private void setHighScore() {
		highScore.setText("HI!");
		panel.add(highScore);
	}
	
	
}
