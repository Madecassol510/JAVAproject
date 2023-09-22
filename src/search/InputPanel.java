package search;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cafeVO.CafeDAO;

public class InputPanel extends JPanel{
		
	JTextField textField;
	Choice category;
	JButton searchBt;
		
	SearchPanel sp;
	ButtonPanel bp;

	public InputPanel(JFrame searchWindow) {
		
		Font font = new Font("코트라 희망체", Font.PLAIN, 18);
		
		textField = new JTextField();
		searchBt = new JButton(CafeDAO.imageScaleChange(new ImageIcon("src/panelDesign/MagnifySearch.png"),60, 60));
		category = new Choice();
		
		sp = new SearchPanel();
		bp = new ButtonPanel();
		
		
		textField.setFont(font);
		
		setPreferredSize(new Dimension(300,100));
		setBackground(new Color(0xF2E9E4));
		setLayout(new BorderLayout());
			
		add(sp);
		add(bp,"East");

		searchBt.setBorderPainted(false);
		searchBt.setContentAreaFilled(false);
		searchBt.setFocusPainted(false);
		
		
		searchBt.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
					if(category.getSelectedItem().equals("카테고리") || textField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "제대로 입력해주세요");
					}		
					else{
						ResultCheck rc = new ResultCheck(category.getSelectedItem(), textField.getText(), searchWindow);
					}
						
			}
		});
	}
	
	// 입력부
	class SearchPanel extends JPanel{
		public SearchPanel() {
			setBackground(new Color(0xF2E9E4));
			
			category.add("카테고리");
			category.add("커피");
			category.add("에이드");
			category.add("스무디");
			category.add("차");
					
			textField.setPreferredSize(new Dimension(170,30));
			category.setPreferredSize(new Dimension(170,40));
			
			add(category);
			add(textField);
		}
	}
	
	// 버튼부
	class ButtonPanel extends JLabel{
		public ButtonPanel() {
				
			setLayout(new FlowLayout(FlowLayout.CENTER,5,12));
			setPreferredSize(new Dimension(100,90));
			
			
			searchBt.setPreferredSize(new Dimension(75,75));
			
			add(searchBt);	
			
			
		}
	}
}





