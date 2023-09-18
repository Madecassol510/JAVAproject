package main;

import cafeVO.CafeDAO;
import cafeVO.Menu;
import mainMenu.FrameBase;
import mainMenu.MainPanel;

public class Main {
	public static void main(String[] args) {
		FrameBase.getInstance(new MainPanel());
		
		
		//db 확인
		/*CafeDAO D = new CafeDAO();
		
		int a = CafeDAO.getList().get(0).getCoffeeMenu().get(0).getPrice();
		System.out.println(a);
		*/
	}
}
