package search;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ResultWindow extends JFrame{
	
	JLabel text;
	JPanel textPanel;
	JPanel ResultPanel;
	
	int pageIndex;
	
	public ResultWindow(int pageIndex) {
			
		
		Font font = new Font("코트라 희망체",Font.PLAIN, 25);
		
		this.pageIndex = pageIndex;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -150,
				(int)tk.getScreenSize().getHeight()/2-155, 300,310);

		getContentPane().setBackground(Color.white);
	
		setLayout(new BorderLayout());
		setBackground(new Color(0xF2E9E4));
		
		textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		text = new JLabel("검색 결과");
		text.setFont(font);
		
		textPanel.add(text);
		textPanel.setBackground(new Color(0xF2E9E4));
		
		add(textPanel);
		add(new ResultPanel(pageIndex), "South");
	}
}










