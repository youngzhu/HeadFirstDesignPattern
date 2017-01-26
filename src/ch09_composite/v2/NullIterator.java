package ch09_composite.v2;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent2> {
	   
		public MenuComponent2 next() {
			return null;
		}
	  
		public boolean hasNext() {
			return false;
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

}
