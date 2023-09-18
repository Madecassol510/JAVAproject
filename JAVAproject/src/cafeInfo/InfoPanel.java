package cafeInfo;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InfoPanel extends JPanel {
	public InfoPanel() {
		setPreferredSize(new Dimension(484, 120));
		setBackground(Color.green);
		setLayout(new FlowLayout(FlowLayout.CENTER, 35, 20));

		ArrayList<JButton> menuButtons = new ArrayList<JButton>();

		/*
		 * // 이미지 아이콘 생성 ImageIcon searchIcon = new ImageIcon("search.png"); ImageIcon
		 * gameIcon = new ImageIcon("gamepad.png"); ImageIcon homeIcon = new
		 * ImageIcon("Home.png");
		 * 
		 * // 이미지 아이콘 크기 조절 Image scaledSearchIcon =
		 * searchIcon.getImage().getScaledInstance(120, 80, Image.SCALE_SMOOTH); Image
		 * scaledGameIcon = gameIcon.getImage().getScaledInstance(120, 80,
		 * Image.SCALE_SMOOTH); Image scaledHomeIcon =
		 * homeIcon.getImage().getScaledInstance(120, 80, Image.SCALE_SMOOTH);
		 * 
		 * // 크기 조절된 이미지 아이콘을 다시 설정 searchIcon = new ImageIcon(scaledSearchIcon);
		 * gameIcon = new ImageIcon(scaledGameIcon); homeIcon = new
		 * ImageIcon(scaledHomeIcon);
		 * 
		 */

		// 버튼 생성 및 이미지 아이콘 설정
		menuButtons.add(new JButton("검색"));
		menuButtons.add(new JButton("게임"));
		menuButtons.add(new JButton("홈"));

		for (JButton button : menuButtons) {
			add(button);
			button.setPreferredSize(new Dimension(120, 80));
			button.addActionListener(new infoMenuButtonEvent());
			// button.setHorizontalAlignment(SwingConstants.CENTER);
		}
	}
}

