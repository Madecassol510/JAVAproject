package search;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class ResultWindow extends JFrame{
	public ResultWindow() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -150,
				(int)tk.getScreenSize().getHeight()/2-90, 300,190);
		

	}
}
