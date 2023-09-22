package search;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class SearchWindow extends JFrame{
	
	JLabel text;
	JPanel textPanel;

	public SearchWindow() {
		
		Font font = new Font("코트라 희망체", Font.PLAIN, 25);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -150,
				(int)tk.getScreenSize().getHeight()/2-90, 300,190);
		
		setLayout(new BorderLayout());
		setBackground(Color.green);
		
		textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		text = new JLabel("메뉴를 검색하세요");
		
		text.setFont(font);
		
		textPanel.add(text);
		textPanel.setPreferredSize(new Dimension(300,100));
		textPanel.setBackground(new Color(0xF2E9E4));
		
		add(textPanel);
		add(new InputPanel(this), "South");
		
		setVisible(true);		
	}
}
