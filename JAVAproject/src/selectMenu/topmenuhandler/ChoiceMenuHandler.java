package selectMenu.topmenuhandler;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import mainMenu.FrameBase;
import selectMenu.SelectMenu;

public class ChoiceMenuHandler implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {

		String selected = (String) e.getItem();

		switch (selected) {
		case "커피":
			FrameBase.getInstance(new SelectMenu("Coffee"));
			break;
		case "에이드":
			FrameBase.getInstance(new SelectMenu("Ade"));
			break;
		case "스무디":
			FrameBase.getInstance(new SelectMenu("Smoothie"));
			break;
		case "차":
			FrameBase.getInstance(new SelectMenu("Tea"));
			break;
		default:
			break;
		}
	}
}
