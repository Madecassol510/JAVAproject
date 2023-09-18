package main;

import cafeVO.CafeDAO;
import cafeVO.Menu;
import mainMenu.FrameBase;
import mainMenu.MainPanel;
import titleWindow.TitleWindow;

public class Main {
	public static void main(String[] args) {
		FrameBase.getInstance(new TitleWindow());
		
		
		//db 확인
		/*CafeDAO D = new CafeDAO();
		
		int a = CafeDAO.getList().get(0).getCoffeeMenu().get(0).getPrice();
		System.out.println(a);
		*/
	}
}
