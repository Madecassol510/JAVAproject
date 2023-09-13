package Map;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Base extends JFrame{
	
	private static Base instance;
	
	public Base(JPanel e) {
		
		
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -300,
				(int)tk.getScreenSize().getHeight()/2-400, 600,800);
		
		
		setLayout(null);
		
	
		add(e);
		setResizable(false);  		
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void getInstance(JPanel e) {
		if(instance == null) {
			instance = new Base(e);
		}
		
		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);
		
		instance.revalidate();
		instance.repaint();
	}
}
