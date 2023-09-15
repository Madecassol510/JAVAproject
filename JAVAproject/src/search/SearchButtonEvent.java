package search;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainMenu.FrameBase;
import search.SearchWindow;
import selectMenu.SelectMenu;

public class SearchButtonEvent implements ActionListener{
	
	public SearchButtonEvent() {
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("검색")) {
			ResultWindow rw = new ResultWindow();
			rw.setVisible(true);
		}
	}
}
