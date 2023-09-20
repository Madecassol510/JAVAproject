package selectMenu.selectMenuListPanel.buttonPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import cafeInfo.CafeInfo;
import cafeVO.CafeDAO;
import mainMenu.FrameBase;

public class TestTotalButtonPanel extends JPanel {
	private ArrayList<Map.Entry<String, Integer>> itemList; // 항목리스트, 여기에 ArrayList<Map.> 오면될거같음
	private int currentPage; // 현재 페이지
	private int itemsPerPage; // 페이지 당 항목 수
	private String menuName;
	

	// 매개변수 생성자
	public TestTotalButtonPanel(ArrayList<Map.Entry<String, Integer>> itemList, int itemsPage, String menuName) {
		this.itemList = itemList;
		this.itemsPerPage = itemsPage;
		this.menuName = menuName;
		this.currentPage = 1;

		setLayout(new FlowLayout());
		showCurrentPage();
	}

	private void showCurrentPage() {
		removeAll(); // 현재 컴포넌트 제거
		int startIndex = (currentPage - 1) * itemsPerPage;
		int endIndex = Math.min(startIndex + itemsPerPage, itemList.size());
		
		switch (menuName) {
		case "아메리카노":
			ImageIcon[] buttonIcons = new ImageIcon[itemList.size()];

			/*
			// itemlist.size()만큼 배열방에 이미지 삽입
			buttonIcons[0] = new ImageIcon("겨울왕국.png");
			buttonIcons[1] = new ImageIcon("겨울왕국.png");
			buttonIcons[2] = new ImageIcon("겨울왕국.png");
			buttonIcons[3] = new ImageIcon("겨울왕국.png");
			buttonIcons[4] = new ImageIcon("겨울왕국.png");
			buttonIcons[5] = new ImageIcon("겨울왕국.png");
			buttonIcons[6] = new ImageIcon("겨울왕국.png");
			buttonIcons[7] = new ImageIcon("겨울왕국.png");
			buttonIcons[8] = new ImageIcon("겨울왕국.png");
			buttonIcons[9] = new ImageIcon("겨울왕국.png");
			buttonIcons[10] = new ImageIcon("겨울왕국.png");
			buttonIcons[11] = new ImageIcon("겨울왕국.png");
			buttonIcons[12] = new ImageIcon("겨울왕국.png");
			buttonIcons[13] = new ImageIcon("겨울왕국.png");
			buttonIcons[14] = new ImageIcon("겨울왕국.png");
			buttonIcons[15] = new ImageIcon("겨울왕국.png");
			buttonIcons[16] = new ImageIcon("겨울왕국.png");
			buttonIcons[17] = new ImageIcon("겨울왕국.png");
			buttonIcons[18] = new ImageIcon("겨울왕국.png");
			*/

			for (int i = startIndex; i < endIndex; i++) {
				String itemText = itemList.get(i).getKey();
				int itemPrice = itemList.get(i).getValue();
				String buttonText = "<html>상호명: " + itemText + "<br>가격: " + itemPrice + "</html>"; // 두 줄 텍스트 생성

				JButton itemButton = new JButton(buttonText);
				itemButton.setPreferredSize(new Dimension(450, 100)); // 버튼 크기 조정

				if (i < buttonIcons.length) {
					ImageIcon itemImageIcon = buttonIcons[i];
					if (itemImageIcon != null) {
						itemButton.setIcon(itemImageIcon);
						// 이미지를 좌측, 텍스트를 우측으로 정렬
			            itemButton.setHorizontalAlignment(SwingConstants.LEFT);
			            itemButton.setVerticalTextPosition(SwingConstants.CENTER);
			            itemButton.setHorizontalTextPosition(SwingConstants.RIGHT);
					}
				}

				itemButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// 버튼 클릭시 상세페이지 이동
						System.out.println("클릭한 항목: " + itemText);
					}
				});
				add(itemButton);
			}
			revalidate(); // 다시 그리기
			break;
			
		case "에이드":
			/*
			int startIndex = (currentPage - 1) * itemsPerPage;
			int endIndex = Math.min(startIndex + itemsPerPage, itemList.size());
			*/
			for (int i = startIndex; i < endIndex; i++) {
				String itemText = itemList.get(i).getKey();
				int itemPrice = itemList.get(i).getValue();
				String buttonText = "<html>상호명: " + itemText + "<br>가격: " + itemPrice + "</html>"; // 두 줄 텍스트 생성

				JButton itemButton = new JButton(buttonText);
				itemButton.setPreferredSize(new Dimension(450, 100)); // 버튼 크기 조정

				/*
				if (i < buttonIcons.length) {
					ImageIcon itemImageIcon = buttonIcons[i];
					if (itemImageIcon != null) {
						itemButton.setIcon(itemImageIcon);
						// 이미지를 좌측, 텍스트를 우측으로 정렬
			            itemButton.setHorizontalAlignment(SwingConstants.LEFT);
			            itemButton.setVerticalTextPosition(SwingConstants.CENTER);
			            itemButton.setHorizontalTextPosition(SwingConstants.RIGHT);
					}
				}
				*/
				itemButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// 버튼 클릭시 상세페이지 이동
						System.out.println("클릭한 항목: " + itemText);
						FrameBase.getInstance2(new CafeInfo(CafeDAO.searchCafe(itemText))); // 기존 프레임의 내용을 지우지 않고 새 프레임만 띄우는 메소드 getInstance2 설정
					}
				});
				add(itemButton);
			}
			revalidate(); // 다시 그리기
			break;
			
		case "스무디":
			/*
			int startIndex = (currentPage - 1) * itemsPerPage;
			int endIndex = Math.min(startIndex + itemsPerPage, itemList.size());
			*/
			for (int i = startIndex; i < endIndex; i++) {
				String itemText = itemList.get(i).getKey();
				int itemPrice = itemList.get(i).getValue();
				String buttonText = "<html>상호명: " + itemText + "<br>가격: " + itemPrice + "</html>"; // 두 줄 텍스트 생성

				JButton itemButton = new JButton(buttonText);
				itemButton.setPreferredSize(new Dimension(450, 100)); // 버튼 크기 조정
				/*
				if (i < buttonIcons.length) {
					ImageIcon itemImageIcon = buttonIcons[i];
					if (itemImageIcon != null) {
						itemButton.setIcon(itemImageIcon);
						// 이미지를 좌측, 텍스트를 우측으로 정렬
			            itemButton.setHorizontalAlignment(SwingConstants.LEFT);
			            itemButton.setVerticalTextPosition(SwingConstants.CENTER);
			            itemButton.setHorizontalTextPosition(SwingConstants.RIGHT);
					}
				}
				*/
				itemButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// 버튼 클릭시 상세페이지 이동
						System.out.println("클릭한 항목: " + itemText);
					}
				});
				add(itemButton);
			}
			revalidate(); // 다시 그리기
			break;
			
		case "차":
			/*
			int startIndex = (currentPage - 1) * itemsPerPage;
			int endIndex = Math.min(startIndex + itemsPerPage, itemList.size());
			*/
			for (int i = startIndex; i < endIndex; i++) {
				String itemText = itemList.get(i).getKey();
				int itemPrice = itemList.get(i).getValue();
				String buttonText = "<html>상호명: " + itemText + "<br>가격: " + itemPrice + "</html>"; // 두 줄 텍스트 생성

				JButton itemButton = new JButton(buttonText);
				itemButton.setPreferredSize(new Dimension(450, 100)); // 버튼 크기 조정
				/*
				if (i < buttonIcons.length) {
					ImageIcon itemImageIcon = buttonIcons[i];
					if (itemImageIcon != null) {
						itemButton.setIcon(itemImageIcon);
						// 이미지를 좌측, 텍스트를 우측으로 정렬
			            itemButton.setHorizontalAlignment(SwingConstants.LEFT);
			            itemButton.setVerticalTextPosition(SwingConstants.CENTER);
			            itemButton.setHorizontalTextPosition(SwingConstants.RIGHT);
					}
				}
				*/
				itemButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// 버튼 클릭시 상세페이지 이동
						System.out.println("클릭한 항목: " + itemText);
					}
				});
				add(itemButton);
			}
			revalidate(); // 다시 그리기
			break;

		default:
			break;
		}
		
		
	} // showCureentPage()

	public void nextPage() {
		int totalPages = (int) Math.ceil((double) itemList.size() / itemsPerPage);
		if (currentPage < totalPages) {
			currentPage++;
			showCurrentPage();
		}
	}

	public void previousPage() {
		if (currentPage > 1) {
			currentPage--;
			showCurrentPage();
		}
	}
}
