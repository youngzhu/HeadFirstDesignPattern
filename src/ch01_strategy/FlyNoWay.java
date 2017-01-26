package ch01_strategy;

public class FlyNoWay implements IFlyBehavior {

	public void fly() {

		System.out.println("我不会飞……");
	}

}
