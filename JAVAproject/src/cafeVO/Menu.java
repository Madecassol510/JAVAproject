package cafeVO;

public class Menu {
	String name;		// 메뉴이름
	int price;			// 가격
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class Coffee extends Menu{
	public Coffee(String name, int price) {
		super(name, price);
		Cafe.getCoffeeList().add(this);
	}
}

class Ade extends Menu{
	public Ade(String name, int price) {
		super(name, price);
		Cafe.getAdeList().add(this);
	}
}

class Smoothie extends Menu{
	public Smoothie(String name, int price) {
		super(name, price);
		Cafe.getSmoothieList().add(this);
	}
}

class Tea extends Menu{
	public Tea(String name, int price) {
		super(name, price);
		Cafe.getTeaList().add(this);
	}
}