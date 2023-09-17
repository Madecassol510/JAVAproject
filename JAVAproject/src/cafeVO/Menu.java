package cafeVO;

import java.util.Objects;

public class Menu implements Comparable<Menu>{
	String name;		// 메뉴이름
	int price;			// 가격
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
		CafeDAO.getTotalMenu().add(this);
	}
	
	
	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}
	
	@Override
	public int compareTo(Menu o) {
		return 0;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Menu) {
			Menu menu = (Menu)obj;
			
			return this.getName().equals(menu.getName());
		}	
		return false;
	}
}

class Coffee extends Menu{
	public Coffee(String name, int price) {
		super(name, price);
	}
}

class Ade extends Menu{
	public Ade(String name, int price) {
		super(name, price);
	}
}

class Smoothie extends Menu{
	public Smoothie(String name, int price) {
		super(name, price);
		
	}
}

class Tea extends Menu{
	public Tea(String name, int price) {
		super(name, price);
	}
}