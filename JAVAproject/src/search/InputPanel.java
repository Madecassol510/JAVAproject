package search;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel{
		
	JTextField textField;
	Choice category;
	Button searchBt;
		
	SearchPanel sp;
	ButtonPanel bp;

	public InputPanel() {
		
		textField = new JTextField();
		searchBt = new Button("검색");
		category = new Choice();
		
		sp = new SearchPanel();
		bp = new ButtonPanel();
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(300,100));
		
		setLayout(new BorderLayout());
			
		add(sp);
		add(bp,"East");
		
		
		
		if(category.getSelectedItem().toString().equals("카테고리")) {
			searchBt.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "카테고리를 선택해주세요");
				}
			});
		}
		else if(category.getSelectedItem().toString().equals("커피")){
			searchBt.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, category.getSelectedItem ());
				}
			});
		}
		else if(category.getSelectedItem().toString().equals("에이드")){
			searchBt.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, category.getSelectedItem ());
				}
			});
		}
		else if(category.getSelectedItem().toString().equals("스무디")){
			searchBt.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, category.getSelectedItem ());
				}
			});
		}
		else if(category.getSelectedItem().toString().equals("차")){
			searchBt.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, category.getSelectedItem ());
				}
			});
		}
	}
	
	// 입력부
	class SearchPanel extends JPanel{		
		public SearchPanel() {
				
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
	class ButtonPanel extends JPanel{
		public ButtonPanel() {
			setBackground(Color.blue);
				
			setLayout(new FlowLayout(FlowLayout.CENTER,5,12));
			setPreferredSize(new Dimension(100,90));
			
			
			searchBt.setPreferredSize(new Dimension(75,75));
			
			add(searchBt);		
		}
	}
}





