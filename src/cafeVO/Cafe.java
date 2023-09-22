package cafeVO;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Cafe {
		
	String name;		// 상호명
	String adress;		// 주소
	ImageIcon image;
	
	//카페 총 메뉴
	ArrayList<Menu> cafeMenu = new ArrayList<>();
	
	//카페의 커피리스트
	ArrayList<Menu> coffeeMenu = new ArrayList<>();
	//카페의 에이드리스트
	ArrayList<Menu> adeMenu = new ArrayList<>();
	//카페의 스무디리스트
	ArrayList<Menu> smoothieMenu = new ArrayList<>();
	//카페의 차리스트
	ArrayList<Menu> teaMenu = new ArrayList<>();
	
	// 생성자
	public Cafe(String name,String adress, ImageIcon image, Menu[] menu) {
		this.name = name;
		this.adress = adress;
		this.image = image;
		
		for(Menu list : menu) {
			cafeMenu.add(list);
		}
		
		CafeMenu();
	}
	
	// 카페 메뉴 분류
	public void CafeMenu() {
		coffeeMenu.clear();
		adeMenu.clear();
		smoothieMenu.clear();
		teaMenu.clear();
		for(Menu menu : cafeMenu) {
			
			if(menu instanceof Coffee) {
				coffeeMenu.add(menu);
			}
			else if(menu instanceof Ade) {
				adeMenu.add(menu);
			}
			else if(menu instanceof Smoothie) {
				smoothieMenu.add(menu);
			}
			else if(menu instanceof Tea) {
				teaMenu.add(menu);
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

	
	
	public ImageIcon getImage() {
		return image;
	}

	public ArrayList<Menu> getCafeMenu() {
		return cafeMenu;
	}

	public void setCafeMenu(ArrayList<Menu> cafeMenu) {
		this.cafeMenu = cafeMenu;
	}

	public ArrayList<Menu> getCoffeeMenu() {
		return coffeeMenu;
	}

	public ArrayList<Menu> getAdeMenu() {
		return adeMenu;
	}

	public ArrayList<Menu> getSmoothieMenu() {
		return smoothieMenu;
	}

	public ArrayList<Menu> getTeaMenu() {
		return teaMenu;
	}
	
	
}