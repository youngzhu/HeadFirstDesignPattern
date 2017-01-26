package ch01_strategy;

public abstract class Duck {

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
}
