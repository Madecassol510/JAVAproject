package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PlayGame extends JPanel{
	
	int playerCount;
	int playTurn;
	ArrayList<String> gameMember;
	
	int kkwangNum;
	int[] oneMore;
	boolean gameEnd;
	
	
	
	public PlayGame(ArrayList<String> gameMember) {
		
		
		this.playerCount = gameMember.size();
		this.oneMore = new int[2*(playerCount-1)];
			
		this.playTurn = 0;
		this.gameMember = gameMember;
		
		this.kkwangNum = (int)(Math.random() * 5 *(playerCount+1)) + 1;
		this.gameEnd = false;
		
		for(int i=0; i<oneMore.length; i++) {
			do {
				oneMore[i] = (int)(Math.random() * 5 *(playerCount+1)) + 1;
			}while(oneMore[i] == kkwangNum);
		}
		
		setPreferredSize(new Dimension(484,551));
		setBackground(Color.blue);
		setLayout(new BorderLayout());
		
		add(new GameMenuPanel(gameMember),"South");
		add(new PlayerPanel());	
	}
	
	class PlayerPanel extends JPanel{
		
		JLabel turnText;
		JLabel gameText;
		
		public PlayerPanel() {		
			setLayout(new BorderLayout());
			turnText = new JLabel();
			gameText = new JLabel();
			
			turnText.setText(gameMember.get(playTurn) +"님의 차례입니다");
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
				
				boolean isClick;
				boolean isOneMore;
				
				public Number(Integer numIndex) {
					
					isClick = false;
					isOneMore = false;
					
					setBorder(new LineBorder(Color.red));
					setText(numIndex.toString());
					setHorizontalAlignment(JLabel.CENTER);
					
					addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent me) {
										
							if(gameEnd || (isClick==true)) {
								return;
							}
													
							if(kkwangNum == numIndex) {
								JOptionPane.showMessageDialog(null, gameMember.get(playTurn) + "님이 당첨되었습니다.");
								setText("당첨");
								gameEnd = true;
							}
							else {
								isClick = true;
								
								
								for(int i=0; i<oneMore.length; i++){
									if(oneMore[i] == numIndex) {
										JOptionPane.showMessageDialog(null, gameMember.get(playTurn) + "님이 한번 더 !");
										turnText.setText(gameMember.get(playTurn) +"님의 차례입니다");
										gameText.setText("한번 더 숫자를 선택해주세요");
										setText("한번더");
										isOneMore = true;
										break;
									}						
								}
								
								if(isOneMore) {
									return;
								}
								
								if(playTurn >= playerCount - 1) {
									playTurn = 0;
								}
								else {
									playTurn++;
								}
								
								setText("X");
								turnText.setText(gameMember.get(playTurn) +"님의 차례입니다");
								gameText.setText("숫자를 선택해주세요");
					
							}
						}
					});
					
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
