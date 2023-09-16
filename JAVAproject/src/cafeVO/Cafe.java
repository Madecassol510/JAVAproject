package cafeVO;

import java.util.ArrayList;

public class Cafe {
		
	String name;		// 상호명
	String adress;		// 주소
	
	//카페 총 메뉴
	ArrayList<Menu> cafeMenu = new ArrayList<>();
	
	//카페의 커피리스트
	ArrayList<Coffee> coffeeMenu = new ArrayList<>();
	//카페의 에이드리스트
	ArrayList<Ade> adeMenu = new ArrayList<>();
	//카페의 스무디리스트
	ArrayList<Smoothie> smoothieMenu = new ArrayList<>();
	//카페의 차리스트
	ArrayList<Tea> teaMenu = new ArrayList<>();
	
	// 생성자
	public Cafe(String name,String adress, Menu[] menu ) {
		this.name = name;
		this.adress = adress;
		
		for(Menu list : menu) {
			cafeMenu.add(list);
		}
		
		CafeMenu();
	}
	
	// 카페 메뉴 분류
	public void CafeMenu() {
		for(Menu menu : cafeMenu) {
			if(menu instanceof Coffee) {
				Coffee coffee = (Coffee) menu;
				coffeeMenu.add(coffee);
			}
			else if(menu instanceof Ade) {
				Ade ade = (Ade) menu;
				adeMenu.add(ade);
			}
			else if(menu instanceof Smoothie) {
				Smoothie smoothie = (Smoothie) menu;
				smoothieMenu.add(smoothie);
			}
			else if(menu instanceof Tea) {
				Tea tea = (Tea) menu;
				teaMenu.add(tea);
			}
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

	public ArrayList<Coffee> getCoffeeMenu() {
		return coffeeMenu;
	}

	public ArrayList<Ade> getAdeMenu() {
		return adeMenu;
	}

	public ArrayList<Smoothie> getSmoothieMenu() {
		return smoothieMenu;
	}

	public ArrayList<Tea> getTeaMenu() {
		return teaMenu;
	}
}
