package ch01_strategy.v2;

import ch01_strategy.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {

	public void fly() {

		System.out.println("我坐火箭飞……");
	}

}
