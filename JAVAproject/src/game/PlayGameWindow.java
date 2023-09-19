package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PlayGameWindow extends JPanel{
	public PlayGameWindow (ArrayList<String> gameMember) {
		setSize(484,662);
		
		Font font = new Font("코트라 희망체", Font.BOLD, 60);
		
		JPanel titlePanel = new JPanel();
		JLabel title = new JLabel();
		title.setText("RUSSIAN ROULETTE");
		
		title.setFont(font);
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));
		
		titlePanel.add(title);
		titlePanel.setPreferredSize(new Dimension(484,100));
		titlePanel.setBackground(Color.green);
		
		setBackground(Color.white);
		
		add(titlePanel, "North");
		add(new PlayGame(gameMember));
	}
}