package game;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import mainMenu.FrameBase;
import search.ResultCheck;

public class InputMemberPanel extends JPanel{
		
	JFrame inputMemberWindow;
	int memberCount;
	TextField[] inputName;
	
	public InputMemberPanel(JFrame inputMemberWindow, int memberCount) {
		this.inputMemberWindow = inputMemberWindow;
		this.memberCount = memberCount;
		this.inputName = new TextField[memberCount];
		
		setPreferredSize(new Dimension(300,260));
		setLayout(new BorderLayout());
		
		
		add(new StartButtonPanel(), "South");
		add(new InputPanel(), "Center");
		
	}
	
	
	class InputPanel extends JPanel{		
		public InputPanel() {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			setBackground(Color.white);
			
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
				
				inputName[index] = new TextField();
				inputName[index].setPreferredSize(new Dimension(100,25));
			
				add(text);
				add(inputName[index]);
				setBorder(new LineBorder(Color.black));
				text.setBorder(new LineBorder(Color.red));
				
				
			}		
		}	
	}
	
	class StartButtonPanel extends JPanel{
		public StartButtonPanel() {
			setPreferredSize(new Dimension(300,50));
			//setBackground(Color.blue);
			setLayout(new BorderLayout());
			
			Button startButton = new Button("Start Game");
			startButton.setPreferredSize(new Dimension(10,50));
			
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
						FrameBase.getInstance(new LadderGame(gameMember));
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
