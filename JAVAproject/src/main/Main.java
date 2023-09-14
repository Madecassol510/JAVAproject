package main;

import mainMenu.FrameBase;
import mainMenu.MainPanel;

public class Main {
	public static void main(String[] args) {
		FrameBase.getInstance(new MainPanel());
	}
}
