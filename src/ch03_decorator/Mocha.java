package ch03_decorator;

/**
 * 摩卡
 * 
 * @author by Yang.ZHU
 *	on 2017-1-6
 *
 * 
 * Package&FileName: ch03.Mocha
 */
public class Mocha extends Condiment {
	Beverage beverage; // 饮料
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + " + 摩卡";
	}

	@Override
	public double cost() {
		return 12 + beverage.cost();
	}

}
