package ch12_compound.v6;

/**
 * 红头鸭（变异物种）
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch12_compound.RedheadDuck
 */
public class RedheadDuck implements Quackable {
	Observable observable;

	public RedheadDuck() {
		observable = new Observable(this);
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "红头鸭";
	}

	public void quack() {

		System.out.println("红头鸭：呱呱呱。。。");
		notifyObservers();
	}

}
