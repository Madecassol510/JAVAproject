package main;

import mainMenu.Base;
import mainMenu.MainPanel;

public class Main {
	public static void main(String[] args) {
		Base.getInstance(new MainPanel());
	}
}
