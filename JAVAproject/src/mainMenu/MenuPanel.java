package mainMenu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
	public MenuPanel() {
		setSize(600,200);
		setBackground(Color.RED);
		setLayout(new FlowLayout());
		
//		JButton bt1 = new JButton("리스트");
//		JButton bt2 = new JButton("게임");
//		JButton bt3 = new JButton("종료");
		
		ArrayList<JButton> bt = new ArrayList<JButton>();
		
		bt.add(new JButton("리스트"));
		bt.add(new JButton("게임"));
		bt.add(new JButton("종료"));
		
		for(int i=0; i< bt.size(); i++) {
			add(bt.get(i));
			bt.get(i).setBounds(40+180*i, 650, 150, 80);
			bt.get(i).addActionListener(new ButtonEvent());
		}		
	}
}
