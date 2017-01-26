package ch03_decorator;

/**
 * 综合咖啡
 * 
 * @author by Yang.ZHU
 *	on 2017-1-6
 *
 * 
 * Package&FileName: ch03.HouseBlend
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		desc = "综合咖啡";
	}

	@Override
	public double cost() {
		return 8;
	}

}
