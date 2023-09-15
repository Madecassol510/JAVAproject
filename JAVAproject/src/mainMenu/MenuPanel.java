package mainMenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
	public MenuPanel() {
		setPreferredSize(new Dimension(484,120));
		setBackground(Color.RED);
		setLayout(new FlowLayout(FlowLayout.CENTER, 35, 20));
		
		ArrayList<JButton> MenuBt = new ArrayList<JButton>();
		
		MenuBt.add(new JButton("검색"));
		MenuBt.add(new JButton("게임"));
		MenuBt.add(new JButton("종료"));
		
		for(int i=0; i< MenuBt.size(); i++) {
			add(MenuBt.get(i));
			MenuBt.get(i).setPreferredSize(new Dimension(120, 80));
			MenuBt.get(i).addActionListener(new MainMenuButtonEvent());
		}		
	}
}
