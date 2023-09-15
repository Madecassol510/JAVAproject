package main;

import cafeVO.CafeDAO;
import cafeVO.Menu;
import mainMenu.FrameBase;
import mainMenu.MainPanel;

public class Main {
	public static void main(String[] args) {
		FrameBase.getInstance(new MainPanel());
	}
}
