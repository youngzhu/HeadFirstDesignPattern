package ch03_decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {

		Beverage beverage = new Espresso();
		System.out.println(beverage.getDesc() + "， ￥" + beverage.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDesc() + "，￥" + houseBlend.cost());
	}

}
