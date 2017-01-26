package ch08_template.v2;

public class Tea extends CaffeineBeverage {

	/**
	 * 茶的制作方法
	 */
	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	public void addLemon() {

		System.out.println("加柠檬");
	}

	public void steepTeaBag() {

		System.out.println("泡茶");
	}
}
