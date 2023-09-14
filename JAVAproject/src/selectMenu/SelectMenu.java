package selectMenu;

import java.awt.Choice;
import java.awt.Color;

import javax.swing.JPanel;

import selectMenu.subPanel.AdePanel;
import selectMenu.subPanel.CoffeePanel;
import selectMenu.subPanel.SmoothiePanel;
import selectMenu.subPanel.TeaPanel;
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
		choiceMenu.setLocation(30, 100);
		choiceMenu.add("종류선택");
		choiceMenu.add("커피");
		choiceMenu.add("에이드");
		choiceMenu.add("스무디");
		choiceMenu.add("차");
		add(choiceMenu);

		// 가격정렬바
		Choice sortingPrice = new Choice();
		sortingPrice.addItemListener(new SortingHandler());
		sortingPrice.setSize(200, 0);
		sortingPrice.setLocation(280, 100);
		sortingPrice.add("가격정렬");
		sortingPrice.add("낮은가격순 정렬");
		sortingPrice.add("높은가격순 정렬");
		add(sortingPrice);

		switch (category) {
		case "Coffee":
			CoffeePanel coffeePanel = new CoffeePanel();
			add(coffeePanel);
			break;
		case "Ade":
			AdePanel adePanel = new AdePanel();
			add(adePanel);
			break;
		case "Smoothie":
			SmoothiePanel smoothiePanel = new SmoothiePanel();
			add(smoothiePanel);
		case "Tea":
			TeaPanel teaPanel = new TeaPanel();
			add(teaPanel);
		default:
			break;
		}
	}
}
