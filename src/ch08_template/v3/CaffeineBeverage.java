package ch08_template.v3;

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
	 * 因为制作流程基本是一样的，所以定义在基类里
	 * 
	 * 定义成 final 是不希望子类覆盖这个方法，
	 * 不让子类去更改制作流程
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	// 冲泡和加调味品的动作需要子类去实现
	// 所以定义为抽象
	abstract void brew();
	abstract void addCondiments();

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
