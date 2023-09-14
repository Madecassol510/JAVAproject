package cafeVO;

import java.util.ArrayList;

public class Cafe {
	private static ArrayList<Coffee> coffeeList = new ArrayList<>();
	private static ArrayList<Ade> adeList = new ArrayList<>();
	private static ArrayList<Smoothie> smoothieList = new ArrayList<>();
	private static ArrayList<Tea> teaList = new ArrayList<>();
	
	
	String name;		// 상호명
	String adress;		// 주소
	
	Coffee[] coffee;
	Ade[] ade;
	Smoothie[] smoothie;
	Tea[] tea;
	
	
	// 생성자
	public Cafe(String name,String adress, Coffee[] coffee, Ade[] ade, Smoothie[] smoothie, Tea[] tea ) {
		this.name = name;
		this.adress = adress;
		
		this.coffee = coffee;
		this.ade = ade;
		this.smoothie = smoothie;
		this.tea = tea;
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

	public Coffee[] getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee[] coffee) {
		this.coffee = coffee;
	}

	public Ade[] getAde() {
		return ade;
	}

	public void setAde(Ade[] ade) {
		this.ade = ade;
	}

	public Smoothie[] getSmoothie() {
		return smoothie;
	}

	public void setSmoothie(Smoothie[] smoothie) {
		this.smoothie = smoothie;
	}

	public Tea[] getTea() {
		return tea;
	}

	public void setTea(Tea[] tea) {
		this.tea = tea;
	}


	
	
	public static ArrayList<Coffee> getCoffeeList() {
		return coffeeList;
	}


	public static ArrayList<Ade> getAdeList() {
		return adeList;
	}


	public static ArrayList<Smoothie> getSmoothieList() {
		return smoothieList;
	}


	public static ArrayList<Tea> getTeaList() {
		return teaList;
	}
	
}
