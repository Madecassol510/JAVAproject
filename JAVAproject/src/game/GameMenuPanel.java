package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import mainMenu.MainMenuButtonEvent;

public class GameMenuPanel extends JPanel{
	public GameMenuPanel() {
		setPreferredSize(new Dimension(484,120));
		setBackground(Color.RED);
		setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		ArrayList<JButton> MenuBt = new ArrayList<JButton>();
		
		MenuBt.add(new JButton("다시하기"));
		MenuBt.add(new JButton("그만하기"));
		
		for(int i=0; i< MenuBt.size(); i++) {
			add(MenuBt.get(i));
			MenuBt.get(i).setPreferredSize(new Dimension(120, 80));
			MenuBt.get(i).addActionListener(new MainMenuButtonEvent());
		}		
	}
}
