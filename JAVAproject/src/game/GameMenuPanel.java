package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import mainMenu.FrameBase;
import mainMenu.MainPanel;

public class GameMenuPanel extends JPanel{
	
	ArrayList<String> gameMember;
	
	public GameMenuPanel(ArrayList<String> gameMember) {
		
		this.gameMember = gameMember;
		
		setPreferredSize(new Dimension(484,120));
		setBackground(Color.RED);
		setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
		
		JButton restartBt = new JButton("다시하기");
		JButton quitBt = new JButton("그만하기");
		
		quitBt.setPreferredSize(new Dimension(120, 80));
		restartBt.setPreferredSize(new Dimension(120, 80));
		
		add(restartBt);
		add(quitBt);
		
		
		
		restartBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new PlayGameWindow(gameMember));
			}
		});
		
		
		quitBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new MainPanel());		
			}
		});
			
		
	
	}		
}

