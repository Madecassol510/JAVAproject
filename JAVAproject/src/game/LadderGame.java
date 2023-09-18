package game;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LadderGame extends JPanel{
	public LadderGame(ArrayList<String> gameMember) {
		setSize(484,662);
		
		JPanel titlePanel = new JPanel();
		JLabel title = new JLabel();
		title.setText("사다리 타기");
		titlePanel.add(title);
		titlePanel.setPreferredSize(new Dimension(484,100));
		titlePanel.setBackground(Color.green);
		
		add(titlePanel, "North");
		add(new PlayLadderGame());
		add(new GameMenuPanel(),"South");
	}
}