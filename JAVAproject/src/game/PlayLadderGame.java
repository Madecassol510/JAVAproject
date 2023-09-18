package game;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PlayLadderGame extends JPanel{
	public PlayLadderGame() {
		setPreferredSize(new Dimension(484,426));
		setLayout(new BorderLayout());
		
		add(new PlayGame(),"Center");
		add(new ButtonPanel(),"South");
		
	}
	class PlayGame extends JPanel{
		public PlayGame() {
			setBackground(Color.blue);
			setPreferredSize(new Dimension(100,300));	
			setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
			
		}
		
		
	}
	
	class ButtonPanel extends JPanel{
		public ButtonPanel() {
			setBackground(Color.green);
			setPreferredSize(new Dimension(484,80));
			setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
			
			Button resultButton = new Button("결과 보기"); 
			resultButton.setPreferredSize(new Dimension(100, 60));
			Button rePlayButton = new Button("다시 하기");
			rePlayButton.setPreferredSize(new Dimension(100, 60));
			
			add(resultButton);
			add(rePlayButton);
		}
	}
}
