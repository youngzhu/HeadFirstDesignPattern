package ch08_template.v2;

public class Coffee extends CaffeineBeverage {

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

	public void brewCoffeeGrinds() {

		System.out.println("冲咖啡");
	}

}
