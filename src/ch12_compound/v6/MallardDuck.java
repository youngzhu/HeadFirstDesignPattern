package ch12_compound.v6;

/**
 * 绿头鸭
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch12_compound.MallardDuck
 */
public class MallardDuck implements Quackable {
	
	Observable observable;
	 
	public MallardDuck() {
		observable = new Observable(this);
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
 
	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "绿头鸭";
	}

	public void quack() {

		System.out.println("绿头鸭：呱呱呱。。。");
		notifyObservers();
	}

}
