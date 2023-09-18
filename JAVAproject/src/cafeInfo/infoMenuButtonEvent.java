package cafeInfo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainMenu.FrameBase;
import mainMenu.MainPanel;
import search.InputPanel;
import search.SearchWindow;
import selectMenu.SelectMenu;

public class infoMenuButtonEvent implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("검색")) {
			SearchWindow sw = new SearchWindow();

		} else if (e.getActionCommand().equals("게임")) {

		}

		else if (e.getActionCommand().equals("홈")) {
			
			CafeInfo.infoFrame.dispose();
			FrameBase.getInstance(new MainPanel());
		}

	}
}
