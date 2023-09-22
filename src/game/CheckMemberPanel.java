package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckMemberPanel extends JPanel{
		
	JTextField textField;
	JButton searchBt;
		
	SearchPanel sp;
	ButtonPanel bp;

	public CheckMemberPanel(JFrame checkMember) {	
		
		
		Font font = new Font("코트라 희망체",Font.PLAIN, 24);
		
		textField = new JTextField();
		searchBt = new JButton("GO!");
		searchBt.setFont(font);
		
		sp = new SearchPanel();
		bp = new ButtonPanel();
		
		setBackground(new Color(0xF2E9E4));
		setPreferredSize(new Dimension(300,60));
		
		setLayout(new BorderLayout());
			
		add(sp);
		add(bp,"East");
		
		
		searchBt.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String strValue = textField.getText();
				
				if(strValue.equals(null)) {
					JOptionPane.showMessageDialog(null, "인원 수를 입력해주세요");
				}
				else if(isNumber(strValue)) {
					int memberCount = Integer.parseInt(strValue);
					
					if(memberCount<=1){
						JOptionPane.showMessageDialog(null, "2명이상의 인원 수를 입력해주세요");
					}
					else if (memberCount>5) {
						JOptionPane.showMessageDialog(null, "최대 5명의 인원 수만 참가 가능합니다.");
					}
					else {
						new InputMemberWindow(memberCount);
						checkMember.setVisible(false);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "숫자를 입력해주세요");
				}	
			}
		});	
	}
	
	// 입력부
	class SearchPanel extends JPanel{
		public SearchPanel() {
			
			setBackground(new Color(0xF2E9E4));
			setLayout(new FlowLayout(FlowLayout.CENTER,5,10));
			
			textField.setPreferredSize(new Dimension(120,30));	
			add(textField);
		}
	}
	
	// 버튼부
	class ButtonPanel extends JPanel{
		public ButtonPanel() {
			
			
			setBackground(new Color(0xF2E9E4));
				
			setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
			setPreferredSize(new Dimension(100,45));
				
			searchBt.setPreferredSize(new Dimension(75,40));		
			add(searchBt);		
		}
	}
	
	
	// 입력 값 체크
	public static boolean isNumber(String strValue) {		
		try {
			Integer.parseInt(strValue);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
}





