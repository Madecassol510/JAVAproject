package mainMenu;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	public MainPanel() {
		setLayout(new BorderLayout());
		setSize(600,800);
		
		add(new MapPanel());
		add(new MenuPanel());

	}
}
