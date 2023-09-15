package search;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class SearchWindow extends JFrame{
	
	JLabel text;
	JPanel textPanel;

	public SearchWindow() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -150,
				(int)tk.getScreenSize().getHeight()/2-90, 300,190);
		
		setLayout(new BorderLayout());
		setBackground(Color.green);
		
		textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		text = new JLabel("메뉴를 검색하세요");
		
		textPanel.add(text);
		textPanel.setBackground(Color.green);
		
		add(textPanel);
		add(new InputPanel(), "South");
		
		setVisible(true);
	}

}
