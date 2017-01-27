package ch12_compound.v6;

/**
 * 橡皮鸭
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch12_compound.RubberDuck
 */
public class RubberDuck implements Quackable {

	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
  
	public String toString() {
		return "橡皮鸭";
	}
	public void quack() {

		System.out.println("橡皮鸭：吱吱吱...");
		notifyObservers();
	}

}
