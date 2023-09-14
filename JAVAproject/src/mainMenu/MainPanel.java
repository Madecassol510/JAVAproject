package mainMenu;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	public MainPanel() {
		setLayout(new BorderLayout());
		setSize(484,662);
		
		add(new Category());
		add(new MenuPanel(),"South");
	}
	
	
}
