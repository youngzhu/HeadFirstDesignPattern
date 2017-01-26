package ch09_composite.v2;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合迭代器
 * 
 * @author by Yang.ZHU
 *	on 2017-1-22
 *
 * 
 * Package&FileName: ch09_composite.v2.CompositeIterator
 */
public class CompositeIterator implements Iterator {
	Stack<Iterator> stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}

	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator it = stack.peek();
			if (! it.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public Object next() {
		if (hasNext()) {
			Iterator iterator = stack.peek();
			MenuComponent2 mc = (MenuComponent2)iterator.next();
			if (mc instanceof Menu2) {
				stack.push(mc.createIterator());
			}
			return mc;
		} else {
			return null;
		}
	}

	public void remove() {

		throw new UnsupportedOperationException();
	}

}
