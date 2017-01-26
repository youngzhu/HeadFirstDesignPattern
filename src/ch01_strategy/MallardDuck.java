package ch01_strategy;

/**
 * 野鸭
 * 
 * @author by Yang.ZHU
 *	on 2016-12-21
 *
 * 
 * Package&FileName: ch01.MallardDuck
 */
public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {

		System.out.println("我是一只小野鸭！");
	}

}
