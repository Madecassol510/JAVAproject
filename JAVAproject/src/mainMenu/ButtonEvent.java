package mainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mainMenu.search.InputSearch;

public class ButtonEvent implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("검색")) {
			
		}
		
		else if(e.getActionCommand().equals("게임")) {
			
		}
		
		else if(e.getActionCommand().equals("종료")) {
			System.exit(0);
		}
		
		else if(e.getActionCommand().equals("Coffee")) {
			
		}
		
		else if(e.getActionCommand().equals("Ade")) {
		
		}
		
		else if(e.getActionCommand().equals("Smoothie")) {
			
		}
		
		else if(e.getActionCommand().equals("Tea")) {
		
		}
	}
}
