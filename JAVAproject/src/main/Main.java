package main;

import Map.Base;
import Map.MainPanel;

public class Main {
	public static void main(String[] args) {
		Base.getInstance(new MainPanel());
	}
}
