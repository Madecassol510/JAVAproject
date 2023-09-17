package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputMemberWindow extends JFrame{
	
	JLabel text;
	JPanel textPanel;
	
	public InputMemberWindow(int memberCount) {
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		setBounds((int)tk.getScreenSize().getWidth()/2 -150,
				(int)tk.getScreenSize().getHeight()/2-170, 300,340);
		
		setLayout(new BorderLayout());
		setBackground(Color.green);
		
		textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		text = new JLabel("참가할 인원의 이름을 입력해주세요");
		
		textPanel.add(text);
		textPanel.setBackground(Color.green);
		
		add(textPanel);
		add(new InputMemberPanel(this, memberCount), "South");
		
		setVisible(true);
	}
}
