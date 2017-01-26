package ch01_strategy.v2;

import ch01_strategy.IFlyBehavior;
import ch01_strategy.IQuackBehavior;

public abstract class Duck2 {

	// 飞 和 叫 的行为接口
	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}

	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
