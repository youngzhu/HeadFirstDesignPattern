package ch09_iterator.v2;

import ch09_iterator.v1.MenuItem;

public class DinnerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
	
	public DinnerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {
		if (position >= items.length 
				|| items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public Object next() {
		MenuItem item = items[position];
		position ++;
		return item;
	}

}
