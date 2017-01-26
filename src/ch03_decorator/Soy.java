package ch03_decorator;

/**
 * 豆浆
 * 
 * @author by Yang.ZHU
 *	on 2017-1-6
 *
 * 
 * Package&FileName: ch03.Soy
 */
public class Soy extends Condiment {
	Beverage beverage; // 饮料
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + " + 豆浆";
	}

	@Override
	public double cost() {
		return 9 + beverage.cost();
	}

}
