package ch08_template.v2;

/**
 * 含有咖啡因的饮料
 * 
 * @author by Yang.ZHU
 *	on 2017-1-18
 *
 * 
 * Package&FileName: ch08_template.v2.CaffeineBeverage
 */
public abstract class CaffeineBeverage {

	/**
	 * 饮料的制作过程设计成抽象
	 * 由子类去实现
	 */
	abstract void prepareRecipe();
	
	
	// 煮开水和装杯都是一样的
	// 所以放到基类里
	// 只是把之前的“咖啡”或者“茶”替换成了“饮料”
	public void pourInCup() {

		System.out.println("把饮料倒进杯子里");
	}

	public void boilWater() {

		System.out.println("煮开水");
	}
}
