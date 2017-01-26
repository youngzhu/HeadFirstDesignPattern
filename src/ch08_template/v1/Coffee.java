package ch08_template.v1;

public class Coffee {

	/**
	 * 咖啡的制作方法
	 */
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	public void addSugarAndMilk() {

		System.out.println("加糖加牛奶");
	}

	public void pourInCup() {

		System.out.println("把咖啡倒进杯子里");
	}

	public void brewCoffeeGrinds() {

		System.out.println("冲咖啡");
	}

	public void boilWater() {

		System.out.println("煮开水");
	}
}
