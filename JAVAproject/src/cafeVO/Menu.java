package cafeVO;

public class Menu {
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