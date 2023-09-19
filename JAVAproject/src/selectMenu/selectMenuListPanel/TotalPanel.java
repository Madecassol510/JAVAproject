package selectMenu.selectMenuListPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;

import cafeVO.CafeDAO;
import selectMenu.selectMenuListPanel.buttonPanel.TestTotalButtonPanel;

public class TotalPanel extends JPanel{
	private ArrayList<Map.Entry<String, Integer>> itemList;
	public ArrayList<Map.Entry<String, Integer>> getItemList() {
		return itemList;
	}
	
	private TestTotalButtonPanel testTotalButtonPanel;
	private JButton nextButton = new JButton("다음 페이지");
	private JButton prevButton = new JButton("이전 페이지");
	private JPanel buttonPanelWrapper = new JPanel(new FlowLayout());
	private String str;
	
	//MainMenuButtonEvent에서 category 인자 받음
	public TotalPanel(String category) {
		//category별로 panel 생성
		switch (category) {
		
		case "Coffee":
			CafeDAO dataCoffee = new CafeDAO();
			// itemList = dataCoffee.sortAmericanoMenu("아메리카노");
			itemList = dataCoffee.sortMenu("아메리카노", true);
			setLayout(new BorderLayout());
			setSize(500, 450);
			setLocation(0, 100);
			
			str = "아메리카노";
			testTotalButtonPanel = new TestTotalButtonPanel(itemList, 4, str);
			add(testTotalButtonPanel, BorderLayout.CENTER);
			nextButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					testTotalButtonPanel.nextPage(); // 다음 페이지로 이동
				}
			});
			
			//JButton prevButton = new JButton("이전 페이지");
			prevButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					testTotalButtonPanel.previousPage(); // 이전 페이지로 이동
				}
			});
			
			//JPanel buttonPanelWrapper = new JPanel(new FlowLayout());
			buttonPanelWrapper.add(prevButton);
			buttonPanelWrapper.add(nextButton);
			add(buttonPanelWrapper, BorderLayout.SOUTH);
			
			break;
			
		case "Ade":
			CafeDAO dataAde = new CafeDAO();
			itemList = dataAde.sortMenu("에이드", true); // 메뉴이름 에이드 중 가격정렬
			setLayout(new BorderLayout());
			setSize(500, 450);
			setLocation(0, 100);
			
			str = "에이드";
			testTotalButtonPanel = new TestTotalButtonPanel(itemList, 4, str);
			add(testTotalButtonPanel, BorderLayout.CENTER);
			
			//JButton nextButton = new JButton("다음 페이지");
			nextButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					testTotalButtonPanel.nextPage(); // 다음 페이지로 이동
				}
			});
			
			//JButton prevButton = new JButton("이전 페이지");
			prevButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					testTotalButtonPanel.previousPage(); // 이전 페이지로 이동
				}
			});
			
			//JPanel buttonPanelWrapper = new JPanel(new FlowLayout());
			buttonPanelWrapper.add(prevButton);
			buttonPanelWrapper.add(nextButton);
			add(buttonPanelWrapper, BorderLayout.SOUTH);
			break;
			
		case "Smoothie":
			CafeDAO dataSmoothie = new CafeDAO();
			itemList = dataSmoothie.sortMenu("스무디", true); // 메뉴이름 에이드 중 가격정렬
			setLayout(new BorderLayout());
			setSize(500, 450);
			setLocation(0, 100);
			
			str = "스무디";
			testTotalButtonPanel = new TestTotalButtonPanel(itemList, 4, str);
			add(testTotalButtonPanel, BorderLayout.CENTER);
			
			//JButton nextButton = new JButton("다음 페이지");
			nextButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					testTotalButtonPanel.nextPage(); // 다음 페이지로 이동
				}
			});
			
			//JButton prevButton = new JButton("이전 페이지");
			prevButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					testTotalButtonPanel.previousPage(); // 이전 페이지로 이동
				}
			});
			
			//JPanel buttonPanelWrapper = new JPanel(new FlowLayout());
			buttonPanelWrapper.add(prevButton);
			buttonPanelWrapper.add(nextButton);
			add(buttonPanelWrapper, BorderLayout.SOUTH);
			break;
			
		case "Tea":
			CafeDAO dataTea = new CafeDAO();
			itemList = dataTea.sortMenu("차", false); // 메뉴이름 에이드 중 가격정렬
			setLayout(new BorderLayout());
			setSize(500, 450);
			setLocation(0, 100);
			
			str = "차";
			testTotalButtonPanel = new TestTotalButtonPanel(itemList, 4, str);
			add(testTotalButtonPanel, BorderLayout.CENTER);
			
			//JButton nextButton = new JButton("다음 페이지");
			nextButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					testTotalButtonPanel.nextPage(); // 다음 페이지로 이동
				}
			});
			
			//JButton prevButton = new JButton("이전 페이지");
			prevButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					testTotalButtonPanel.previousPage(); // 이전 페이지로 이동
				}
			});
			
			//JPanel buttonPanelWrapper = new JPanel(new FlowLayout());
			buttonPanelWrapper.add(prevButton);
			buttonPanelWrapper.add(nextButton);
			add(buttonPanelWrapper, BorderLayout.SOUTH);
			break;
		default:
			break;
		} // switch
	}
	
}
