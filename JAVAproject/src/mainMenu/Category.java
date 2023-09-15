package mainMenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Category extends JPanel{
	
	JPanel categoryMenu;
	
	public Category() {
		setPreferredSize(new Dimension(484,562));
		setLayout(new FlowLayout(FlowLayout.CENTER,50,80));
		setBackground(Color.blue);
		
		categoryMenu = new JPanel();
		add(categoryMenu, "Center");
		
		categoryMenu.setBackground(new Color(0,0,0,125));
		categoryMenu.setPreferredSize(new Dimension(380, 400));
		categoryMenu.setLayout(new GridLayout(2,2,50,50));
		
		ArrayList<JButton> categoryBt = new ArrayList<JButton>();
		
		categoryBt.add(new JButton("Coffee"));
		categoryBt.add(new JButton("Ade"));
		categoryBt.add(new JButton("Smoothie"));
		categoryBt.add(new JButton("Tea"));
		
		for(int i=0; i< categoryBt.size(); i++) {
			categoryMenu.add(categoryBt.get(i));
			categoryBt.get(i).addActionListener(new MainMenuButtonEvent());
		}
	}
}
