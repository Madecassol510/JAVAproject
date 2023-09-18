package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PlayLadderGame extends JPanel{
	
	int playerCount;
	int playTune;
	ArrayList<String> gameMember;
	
	
	public PlayLadderGame(ArrayList<String> gameMember) {
		this.playTune = 0;
		this.playerCount = gameMember.size();
		this.gameMember = gameMember;
		
		
		setPreferredSize(new Dimension(484,551));
		setBackground(Color.blue);
		setLayout(new BorderLayout());
		
		add(new GameMenuPanel(),"South");
		add(new PlayerPanel());	
	}
	
	class PlayerPanel extends JPanel{
		public PlayerPanel() {		
			setLayout(new BorderLayout());
			JLabel turnText = new JLabel();
			JLabel gameText = new JLabel();
			
			turnText.setText(gameMember.get(playTune) +"님의 차례입니다");
			gameText.setText("숫자를 선택해주세요");
			
			turnText.setPreferredSize(new Dimension(484,80));
			gameText.setPreferredSize(new Dimension(484,80));
			turnText.setBorder(new LineBorder(Color.red));
			gameText.setBorder(new LineBorder(Color.red));
			
			turnText.setHorizontalAlignment(JLabel.CENTER);
			gameText.setHorizontalAlignment(JLabel.CENTER);
	
			
			add(turnText,"North");
			add(gameText,"South");
			add(new NumberTable(),"Center");
			add(new bin(),"West");
			add(new bin(),"East");
		}
		
		
		class NumberTable extends JPanel{
			public NumberTable() {
				setBackground(Color.green);
				setPreferredSize(new Dimension(100,80));
				setLayout(new GridLayout(5,playerCount+1));
				
				Number[] num = new Number[5*(playerCount+1)];
				
				for(int i=0; i<(5*(playerCount+1)); i++) {
					num[i] = new Number(i+1);
					add(num[i]);
				}
			}
			
			class Number extends JLabel{
				public Number(Integer numIndex) {
					setBorder(new LineBorder(Color.red));
					setText(numIndex.toString());
					setHorizontalAlignment(JLabel.CENTER);
				}
			}
			
		}
		
		class bin extends JPanel{
			public bin() {
				setPreferredSize(new Dimension(50,0));
			}
		}
	}
}
