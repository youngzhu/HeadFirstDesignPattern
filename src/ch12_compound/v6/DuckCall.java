package ch12_compound.v6;

/**
 * 鸭鸣器
 * 
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch12_compound.DuckCall
 */
public class DuckCall implements Quackable {
	
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "鸭鸣器";
	}

	public void quack() {

		System.out.println("鸭鸣器：呱呜呱呜...");
		notifyObservers();
	}

}
