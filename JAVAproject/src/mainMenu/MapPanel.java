package mainMenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MapPanel extends JPanel{
	public MapPanel() {
		setSize(600,600);
		
//		ImageIcon mapImage = new ImageIcon("MapIcon.PNG");
//		Image img = mapImage.getImage();
//		Image changeImg = img.getScaledInstance(700, 700, Image.SCALE_SMOOTH);
//		ImageIcon changeIcon = new ImageIcon(changeImg);
//
//		JLabel MapLabel = new JLabel(changeIcon);
//		MapLabel.setSize(600, 600);
//		add(MapLabel);
		
		setBackground(Color.blue);
		

	}
}
