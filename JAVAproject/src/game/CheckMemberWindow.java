package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import search.InputPanel;

public class CheckMemberWindow extends JFrame{
	
	JLabel text;
	JPanel textPanel;
	
	
	public CheckMemberWindow() {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -125,
				(int)tk.getScreenSize().getHeight()/2-75, 250,150);
		
		setLayout(new BorderLayout());
		setBackground(Color.green);
		
		textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		text = new JLabel("참가할 인원 수를 입력하세요");
		
		textPanel.add(text);
		textPanel.setBackground(Color.green);
		
		add(textPanel);
		add(new CheckMemberPanel(this), "South");
		
		setVisible(true);
		
	}
}
