package ch04_factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "芝加哥风味的披萨";
		dough = "厚饼";
		sauce = "小番茄酱";
		
		toppings.add("白干酪");
		toppings.add("火腿肠");
	}
	
	void cut() {
		System.out.println("芝加哥的披萨要切成方形，正方形");
	}
}
