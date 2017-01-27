package ch12_compound.v5;

import java.util.*;

import ch12_compound.Quackable;

public class Flock implements Quackable {

	List<Quackable> quackers = new ArrayList<Quackable>();
	 
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
 
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}
 
}
