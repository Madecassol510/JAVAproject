package mainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cafeInfo.CafeInfo;
import cafeVO.CafeDAO;
import game.CheckMemberWindow;
import search.SearchWindow;
import selectMenu.SelectMenu;

public class MainMenuButtonEvent implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("검색")) {
			SearchWindow sw = new SearchWindow();
			
		}	
		else if(e.getActionCommand().equals("게임")) {
			new CheckMemberWindow();
		}
		
		else if(e.getActionCommand().equals("종료")) {
			//System.exit(0);
			CafeDAO cd = new CafeDAO();
			FrameBase.getInstance(new CafeInfo(cd.searchCafe("퀸카페 종각점")));
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
