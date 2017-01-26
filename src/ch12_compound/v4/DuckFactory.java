package ch12_compound.v4;

import ch12_compound.*;

/**
 * 普通的工厂类
 * 直接产生鸭子对象
 * 
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch12_compound.v4.DuckFactory
 */
public class DuckFactory extends AbstractDuckFactory {

	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
