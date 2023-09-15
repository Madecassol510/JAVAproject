package cafeVO;

import java.util.ArrayList;

public class Cafe {
		
	String name;		// 상호명
	String adress;		// 주소
	
	
	ArrayList<Menu> cafeMenu = new ArrayList<>();
	
	// 생성자
	public Cafe(String name,String adress, Menu[] menu ) {
		this.name = name;
		this.adress = adress;
		
		for(Menu list : menu) {
			cafeMenu.add(list);
		}
	}
	


	// Get/set메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}


	public ArrayList<Menu> getCafeMenu() {
		return cafeMenu;
	}

	public void setCafeMenu(ArrayList<Menu> cafeMenu) {
		this.cafeMenu = cafeMenu;
	}
	
}
