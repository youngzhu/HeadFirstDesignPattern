package ch12_compound.v6;

/**
 * 装饰者
 * 带有计数器的会“呱呱叫“的东西
 * 
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch12_compound.v3.QuackCounter
 */
public class QuackCounter implements Quackable {

	Quackable duck;
	// 用静态变量统计所有叫的次数
	static int numberOfQuacks;
  
	public QuackCounter (Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {

		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {

		duck.notifyObservers();
	}

}
