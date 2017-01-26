package ch03_decorator;

/**
 * 浓缩咖啡
 * 
 * @author by Yang.ZHU
 *	on 2017-1-6
 *
 * 
 * Package&FileName: ch03.Espresso
 */
public class Espresso extends Beverage {

	public Espresso() {
		desc = "浓缩咖啡";
	}

	@Override
	public double cost() {
		return 15;
	}

}
