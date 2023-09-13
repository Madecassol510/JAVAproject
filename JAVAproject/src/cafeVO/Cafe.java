package cafeVO;

public class Cafe {
	
	
	String name;
	String adress;
	
	Coffee[] coffee;
	Ade[] ade;
	Smoothie[] smoothie;
	Tea[] tea;
	
	public Cafe(String name,String adress, Coffee[] coffee, Ade[] ade, Smoothie[] smoothie, Tea[] tea ) {
		this.name = name;
		this.adress = adress;
		
		this.coffee = coffee;
		this.ade = ade;
		this.smoothie = smoothie;
		this.tea = tea;
	}

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
}
