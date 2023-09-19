package mainMenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import cafeVO.CafeDAO;

public class CategoryPanel extends JPanel{
	
	JPanel categoryMenu;
	
	public CategoryPanel() {
		
		
		Font font = new Font("francisco",Font.BOLD,60);
		
		
		setPreferredSize(new Dimension(484,562));
		setLayout(new FlowLayout(FlowLayout.CENTER,50,80));
	
		
		
		categoryMenu = new JPanel();
		add(categoryMenu, "Center");
		
		categoryMenu.setPreferredSize(new Dimension(380, 400));
		categoryMenu.setLayout(new GridLayout(2,2,50,50));
		
		
		JButton coffeeBt = new JButton("Coffee");
		JButton adeBt = new JButton("Ade");
		JButton smoothieBt = new JButton("Smoothie");
		JButton teaBt = new JButton("Tea");
		
		coffeeBt.setFont(font);
		adeBt.setFont(font);
		smoothieBt.setFont(font);
		teaBt.setFont(font);		
		

		coffeeBt.addActionListener(new MainMenuButtonEvent());	
		
		coffeeBt.setBorderPainted(false);
		coffeeBt.setContentAreaFilled(false);
		coffeeBt.setFocusPainted(false);
		coffeeBt.setRolloverEnabled(getFocusTraversalKeysEnabled());
		//coffeeBt.setRolloverIcon(tpCjr);
		categoryMenu.add(coffeeBt);
		
	}
	
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		ImageIcon image = CafeDAO.imageScaleChange(new ImageIcon("61.jpg"), d.width, d.height);
		g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);
	}
}