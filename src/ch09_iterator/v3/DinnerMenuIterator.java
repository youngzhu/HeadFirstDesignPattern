package ch09_iterator.v3;

import java.nio.channels.IllegalSelectorException;
import java.util.Iterator;

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

	/**
	 * 移除某个元素（最后一次调用 next 返回的元素）
	 * 
	 * 移除后，需要将其后面的元素都前移一位
	 */
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException(
					"只是执行过一次next方法才能执行移除操作！");
		}
		
		if (items[position - 1] != null) {
			for (int i = position - 1; i < items.length - 1; i ++) {
				items[i] = items[i + 1];
			}
			
			items[items.length - 1] = null;
		}
	}

}
