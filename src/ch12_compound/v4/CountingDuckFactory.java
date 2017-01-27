package ch12_compound.v4;

import ch12_compound.*;
import ch12_compound.v3.QuackCounter;

/**
 * 带有计数器的鸭子（被装饰者包装过的）工厂
 *
 * @author by Young.ZHU
 *      on 2017年1月27日
 *
 * Package&FileName: ch12_compound.v4.CountingDuckFactory
 */
public class CountingDuckFactory extends AbstractDuckFactory {

	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
