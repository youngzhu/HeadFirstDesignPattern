package ch03_decorator;

/**
 * 饮料超类
 * 
 * @author by Yang.ZHU
 *	on 2017-1-6
 *
 * 
 * Package&FileName: ch03.Beverage
 */
public abstract class Beverage {

	String desc = "未知饮料"; // 描述
	
	public String getDesc() {
		return desc;
	}
	
	public abstract double cost();
}
