package selectMenu.topmenuhandler;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import cafeVO.CafeDAO;
import mainMenu.FrameBase;
import selectMenu.SelectMenu;
import selectMenu.selectMenuListPanel.TotalPanel;

public class SortingHandler implements ItemListener{
	private String category;
	
	public SortingHandler(String category) {
		this.category = category;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		

	}
	

}
