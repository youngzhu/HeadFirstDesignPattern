package ch09_iterator.v2;

import java.util.List;

import ch09_iterator.v1.MenuItem;

public class BreakfastMenuIterator implements Iterator {

	List<MenuItem> items;
	int index = 0;
	
	public BreakfastMenuIterator(List<MenuItem> items) {
		this.items = items;
	}

	public boolean hasNext() {
		if (index >= items.size() 
				|| items.get(index) == null) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		MenuItem item = items.get(index);
		index ++;
		return item;
	}

}
