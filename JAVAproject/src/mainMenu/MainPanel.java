package mainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import cafeVO.CafeDAO;

public class MainPanel extends JPanel{
	public MainPanel() {
		setLayout(new BorderLayout());
		setSize(484,662);
		
		add(new CategoryPanel());
		add(new MenuPanel(),"South");
	}
	
	
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		ImageIcon image = CafeDAO.imageScaleChange(
				new ImageIcon("61.jpg"), d.width, d.height);
		g.drawImage(image.getImage(),0,0,d.width,d.height,null);
	}
}
