package selectMenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import cafeVO.CafeDAO;

public class SelectMenuPanel extends JLabel{
	public SelectMenuPanel() {
		setPreferredSize(new Dimension(484,120));
		setBackground(Color.RED);
		setLayout(new FlowLayout(FlowLayout.CENTER, 35, 20));
		//setBorder(new MatteBorder(4, 0, 0, 0, Color.black));

		ArrayList<JButton> MenuBt = new ArrayList<JButton>();
		
		MenuBt.add(new JButton(CafeDAO.imageScaleChange(new ImageIcon("src/panelDesign/MagnifierButton.png"), 80, 80)));
		MenuBt.add(new JButton(CafeDAO.imageScaleChange(new ImageIcon("src/soldesk_pro01_img/house.png"), 80, 80)));
		MenuBt.add(new JButton(CafeDAO.imageScaleChange(new ImageIcon("src/panelDesign/DiceButton.png"), 80, 80)));
		
		for(int i=0; i< MenuBt.size(); i++) {
			add(MenuBt.get(i));
			MenuBt.get(i).setPreferredSize(new Dimension(120, 85));
			MenuBt.get(i).setBorderPainted(false);
			MenuBt.get(i).setContentAreaFilled(false);
			MenuBt.get(i).setFocusPainted(false);
			MenuBt.get(i).setRolloverEnabled(getFocusTraversalKeysEnabled());
			
			if(i==0) {
				MenuBt.get(i).addActionListener(new SelectMenuButtonEvent("검색"));
			}
			else if (i==1) {
				MenuBt.get(i).addActionListener(new SelectMenuButtonEvent("홈"));
			}
			else {
				MenuBt.get(i).addActionListener(new SelectMenuButtonEvent("게임"));
			}
		}

	
	}
	

}
