package mainMenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import cafeVO.CafeDAO;

public class CategoryPanel extends JLabel{
	
	JLabel categoryMenu;
	
	public CategoryPanel() {
		
		
		Font font = new Font("francisco",Font.BOLD, 50);
		
		
		setPreferredSize(new Dimension(484,562));
		setLayout(new FlowLayout(FlowLayout.CENTER, 0 ,90));
		
		
		
		categoryMenu = new JLabel();
		add(categoryMenu, "Center");
		
		categoryMenu.setPreferredSize(new Dimension(380, 400));
		categoryMenu.setLayout(new GridLayout(2,2,50,30));
		
		
		
		ArrayList<JButton> categoryBt = new ArrayList<JButton>();
		
		categoryBt.add(new JButton("Coffee",CafeDAO.imageScaleChange(new ImageIcon("CoffeeCategory.png"), 90, 90)));
		categoryBt.add(new JButton("Ade",CafeDAO.imageScaleChange(new ImageIcon("AdeCategory.png"), 90, 90)));
		categoryBt.add(new JButton("Smoothie",CafeDAO.imageScaleChange(new ImageIcon("SmoothieCategory.png"), 90, 90)));
		categoryBt.add(new JButton("Tea",CafeDAO.imageScaleChange(new ImageIcon("TeaCategory.png"), 90, 90)));
		
		for(int i=0; i< categoryBt.size(); i++) {
			categoryMenu.add(categoryBt.get(i));
			categoryBt.get(i).setHorizontalTextPosition(JLabel.CENTER);
			categoryBt.get(i).setVerticalTextPosition(JButton.BOTTOM);
			categoryBt.get(i).setBorderPainted(false);
			categoryBt.get(i).setContentAreaFilled(false);
			categoryBt.get(i).setFocusPainted(false);
			categoryBt.get(i).setRolloverEnabled(getFocusTraversalKeysEnabled());
			categoryBt.get(i).setPreferredSize(new Dimension(120, 80));
			categoryBt.get(i).setFont(font);
			categoryBt.get(i).addActionListener(new MainMenuButtonEvent());
					
		}	
		
		
//		setBorder(new LineBorder(Color.red));
//		categoryMenu.setBorder(new LineBorder(Color.red));
//		categoryBt.get(1).setBorder(new LineBorder(Color.red));
	}
	
}