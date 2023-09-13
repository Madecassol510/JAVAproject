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
}
