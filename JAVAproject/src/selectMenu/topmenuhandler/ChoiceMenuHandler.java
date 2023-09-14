package selectMenu.topmenuhandler;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JPanel;

public class ChoiceMenuHandler implements ItemListener{

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = (String)e.getItem();
		if(str.equals("커피")) {
			System.out.println("coffee");
		}
	}

}
