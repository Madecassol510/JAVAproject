package mainMenu.search;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SearchWindow extends JFrame{
	
	JTextField textField;
	
	public SearchWindow() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -150,
				(int)tk.getScreenSize().getHeight()/2-85, 300,170);
		textField = new JTextField();
	}
}
