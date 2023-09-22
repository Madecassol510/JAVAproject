package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mainMenu.FrameBase;

public class InputMemberPanel extends JPanel{
		
	JFrame inputMemberWindow;
	int memberCount;
	TextField[] inputName;
	Font font;
	
	public InputMemberPanel(JFrame inputMemberWindow, int memberCount) {
		this.inputMemberWindow = inputMemberWindow;
		this.memberCount = memberCount;
		this.inputName = new TextField[memberCount];
		
	
		
		setPreferredSize(new Dimension(300,260));
		setLayout(new BorderLayout());
		setBackground(new Color(0xF2E9E4));
		
		add(new StartButtonPanel(), "South");
		add(new InputPanel(), "Center");
		
	}
	
	
	class InputPanel extends JPanel{		
		public InputPanel() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			setBackground(new Color(0xF2E9E4));
			
			InputTextPanel[] jpanel = new InputTextPanel[memberCount];
			
			for(int i=0; i<memberCount; i++) {
				jpanel[i] = new InputTextPanel(i);
			}
			
			for(int i=0; i<memberCount; i++) {
				add(jpanel[i]);
			}
		}
		
		class InputTextPanel extends JPanel {
			// 결과 패널
			public InputTextPanel(int index) {
				
				font = new Font("코트라 희망체",Font.PLAIN, 20);
				
				if(memberCount == 2) {
					setLayout(new FlowLayout(FlowLayout.CENTER,10,35));
				}
				else if(memberCount == 3){
					setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
				}
				else if(memberCount == 4){
					setLayout(new FlowLayout(FlowLayout.CENTER,10,13));
				}
				else if(memberCount == 5){
					setLayout(new FlowLayout(FlowLayout.CENTER,10,8));
				}
				
				JLabel text = new JLabel();
				text.setText((index+1) + "번째");
				text.setFont(font);
				
				inputName[index] = new TextField();
				inputName[index].setPreferredSize(new Dimension(100,25));
			
				add(text);
				add(inputName[index]);
				setBackground(new Color(0xF2E9E4));
			}		
		}	
	}
	
	class StartButtonPanel extends JPanel{
		public StartButtonPanel() {
			
			font = new Font("코트라 희망체",Font.PLAIN, 35);
			
			setPreferredSize(new Dimension(300,50));
			setBackground(new Color(0xF2E9E4));
			setLayout(new BorderLayout());
			
			JButton startButton = new JButton("[  Game Start  ]");
			startButton.setFont(font);
			startButton.setPreferredSize(new Dimension(10,50));
			startButton.setBorderPainted(false);
			startButton.setContentAreaFilled(false);
			startButton.setFocusPainted(false);
			
			add(startButton,"Center");
			
			startButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ArrayList<String> gameMember = new ArrayList<>();
					
					
					for(int i=0; i<inputName.length; i++) {
						if(inputName[i].getText().equals(""))
							break;
						gameMember.add(inputName[i].getText());
					}
					
					if(gameMember.size() == memberCount) {
						FrameBase.getInstance(new PlayGameWindow(gameMember));
						inputMemberWindow.setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null, "제대로 입력해주세요");
					}
				}
			});
		}
	}

}
