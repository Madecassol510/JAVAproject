package mainMenu;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
}
