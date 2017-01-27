package ch12_compound.v6;

import ch12_compound.v2.Goose;

/**
 * 鹅的适配器
 * 
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch12_compound.v2.GooseAdapter
 */
public class GooseAdapter implements Quackable {
	
	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}

	public void quack() {
		goose.honk();
		observable.notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {

		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {

		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		return "鹅伪装的鸭子";
	}

}
