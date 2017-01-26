package ch03_decorator;

/**
 * 奶泡
 * 
 * @author by Yang.ZHU
 *	on 2017-1-6
 *
 * 
 * Package&FileName: ch03.Whip
 */
public class Whip extends Condiment {
	Beverage beverage; // 饮料
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + " + 奶泡";
	}

	@Override
	public double cost() {
		return 6 + beverage.cost();
	}

}
