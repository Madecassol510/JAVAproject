package cafeVO;

public class Cafe {
	
	
	String name;
	
	Coffee[] coffee;
	Ade[] ade;
	Smoothie[] smoothie;
	Tea[] tea;
	
	public Cafe(String name, Coffee[] coffee, Ade[] ade, Smoothie[] smoothie, Tea[] tea ) {
		this.name = name;
		this.coffee = coffee;
		this.ade = ade;
		this.smoothie = smoothie;
		this.tea = tea;
		
	}
}
