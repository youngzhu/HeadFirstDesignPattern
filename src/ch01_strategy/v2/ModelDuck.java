package ch01_strategy.v2;

import ch01_strategy.FlyNoWay;
import ch01_strategy.Quack;

/**
 * 玩具鸭
 * 
 * @author by Yang.ZHU
 *	on 2017-1-5
 *
 * 
 * Package&FileName: ch01.v2.ModelDuck
 */
public class ModelDuck extends Duck2 {

	public ModelDuck() {
		flyBehavior = new FlyNoWay(); // 不会飞
		quackBehavior = new Quack(); // 会叫
	}

	@Override
	public void display() {

		System.out.println("我是玩具鸭，啦啦啦！");
	}
}
