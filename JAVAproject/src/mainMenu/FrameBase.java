package mainMenu;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cafeVO.CafeDAO;

public class FrameBase extends JFrame{
	
	private static FrameBase instance;
	
	public FrameBase(JPanel e) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -250,
				(int)tk.getScreenSize().getHeight()/2-300, 500,700);
	
		setLayout(null);
		add(e);
		setResizable(false);  		
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		JLabel background = new JLabel(CafeDAO.imageScaleChange(
//				new ImageIcon("61.jpg"), 500, 700));
//		
//		add(background);
//		
		
	}
	
	public static void getInstance(JPanel e) {
		if(instance == null) {
			instance = new FrameBase(e);
		}	
		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);
		
		instance.revalidate();
		instance.repaint();
	}
	
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		ImageIcon image = CafeDAO.imageScaleChange(
				new ImageIcon("61.jpg"), d.width, d.height);
		g.drawImage(image.getImage(),0,0,d.width,d.height,null);
	}
	
}
