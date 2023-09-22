package mainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import cafeInfo.CafeInfo;
import cafeVO.CafeDAO;
import game.CheckMemberWindow;
import search.SearchWindow;
import selectMenu.SelectMenu;

public class MainMenuButtonEvent implements ActionListener{
	
	String btName;
	
	public MainMenuButtonEvent() {
		btName = "Nothing";
	}
	
	public MainMenuButtonEvent(String btName) {
		this.btName = btName;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btName.equals("검색")) {
			// 검색버튼
			new SearchWindow();
			
		}	
		else if(btName.equals("게임")) {
			// 게임버튼
			new CheckMemberWindow();
		}
		
		else if(btName.equals("종료")) {
			System.exit(0);
		}
		
		else if(e.getActionCommand().equals("Coffee")) {
			FrameBase.getInstance(new SelectMenu("Coffee"));
		}	
		
		else if(e.getActionCommand().equals("Ade")) {
			FrameBase.getInstance(new SelectMenu("Ade"));
		}
		
		else if(e.getActionCommand().equals("Smoothie")) {
			FrameBase.getInstance(new SelectMenu("Smoothie"));
		}
		
		else if(e.getActionCommand().equals("Tea")) {
			FrameBase.getInstance(new SelectMenu("Tea"));
		}
	}
}
