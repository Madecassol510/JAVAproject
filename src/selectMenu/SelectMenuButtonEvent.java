package selectMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cafeInfo.CafeInfo;
import cafeVO.CafeDAO;
import game.CheckMemberWindow;
import mainMenu.FrameBase;
import mainMenu.MainPanel;
import search.SearchWindow;

public class SelectMenuButtonEvent implements ActionListener{
	
	String btName;
	
	public SelectMenuButtonEvent() {
		btName = "Nothing";
	}
	
	public SelectMenuButtonEvent(String btName) {
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
		
		else if(btName.equals("홈")) {
			// 종료버튼
			//System.exit(0);
			FrameBase.getInstance(new MainPanel());
		}
	}
}
