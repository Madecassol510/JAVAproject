package selectMenu;

import java.awt.Choice;
import java.awt.Color;

import javax.swing.JPanel;

import mainMenu.FrameBase;
import selectMenu.selectMenuListPanel.TotalPanel;
import selectMenu.topmenuhandler.ChoiceMenuHandler;
import selectMenu.topmenuhandler.SortingHandler;

public class SelectMenu extends JPanel {
	
	public SelectMenu(String category) {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		setSize(500, 700);
		

		// 메뉴선택바
		Choice choiceMenu = new Choice();
		choiceMenu.addItemListener(new ChoiceMenuHandler());
		choiceMenu.setSize(200, 0);
		choiceMenu.setLocation(30, 50);
		choiceMenu.add("커피");
		choiceMenu.add("에이드");
		choiceMenu.add("스무디");
		choiceMenu.add("차");
		add(choiceMenu);
		
		// ChoiceMenuHandelr()에서 getInstance로 초기화시 해당 category로 choice고정
		switch (category) {
		case "Coffee":
			choiceMenu.select("커피");
			break;
		case "Ade":
			choiceMenu.select("에이드");
			break;
		case "Smoothie":
			choiceMenu.select("스무디");
			break;
		case "Tea":
			choiceMenu.select("차");
			break;
		default:
			break;
		}

		// 가격정렬바
		Choice sortingPrice = new Choice();
		sortingPrice.addItemListener(new SortingHandler(category));
		sortingPrice.setSize(200, 0);
		sortingPrice.setLocation(280, 50);
		sortingPrice.add("낮은가격순 정렬");
		sortingPrice.add("높은가격순 정렬");
		add(sortingPrice);
		sortingPrice.select("낮은가격순 정렬"); // 낮은가격순메서드발동
		

		// 메뉴패널 생성
		TotalPanel totalPanel = new TotalPanel(category);
		add(totalPanel);
		
	}
}
