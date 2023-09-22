package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cafeVO.CafeDAO;

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
		
		add(titlePanel, "North");
		add(new PlayGame(gameMember));
	}
	
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		ImageIcon image = CafeDAO.imageScaleChange(new ImageIcon("src/panelDesign/FrameBackground.jpg"), d.width, d.height);
		g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);
	}
}