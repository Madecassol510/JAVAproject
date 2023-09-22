package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckMemberWindow extends JFrame{
	
	JLabel text;
	JPanel textPanel;
	
	
	public CheckMemberWindow() {
		
		Font font = new Font("코트라 희망체",Font.PLAIN, 21);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -125,
				(int)tk.getScreenSize().getHeight()/2-75, 250,150);
		
		setLayout(new BorderLayout());
		setBackground(Color.green);
		
		textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		text = new JLabel("참가할 인원 수를 입력하세요");
		text.setFont(font);
		
		textPanel.add(text);
		textPanel.setBackground(new Color(0xF2E9E4));
		
		add(textPanel);
		add(new CheckMemberPanel(this), "South");
		
		setVisible(true);
		
	}
}
