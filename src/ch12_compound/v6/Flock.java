package ch12_compound.v6;

import java.util.*;

public class Flock implements Quackable {

	List<Quackable> quackers = new ArrayList<Quackable>();
	 
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
 
	public void quack() {
		Iterator<Quackable> iterator = getQuackers();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}
	
	private Iterator<Quackable> getQuackers() {
		return quackers.iterator();
	}

	@Override
	public void registerObserver(Observer observer) {

		Iterator<Quackable> iterator = getQuackers();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {

		Iterator<Quackable> iterator = getQuackers();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.notifyObservers();
		}
	}
	
	@Override
	public String toString() {
		return "一群鸭子";
	}
}
