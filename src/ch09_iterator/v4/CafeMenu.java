package ch09_iterator.v4;

import java.util.HashMap;
import java.util.Iterator;

import ch09_iterator.v1.MenuItem;
import ch09_iterator.v3.Menu;

public class CafeMenu implements Menu {
	HashMap menuItems = new HashMap();
	
	public CafeMenu() {
		addItem("夏日激情", "一杯星冰乐 + 一个马卡龙", true, 88);
		addItem("悠然午后", "一杯卡布奇诺 + 一块小蛋糕", true, 58);
	}

	private void addItem(String name, String desc
			, boolean isVegetarian, double price) {
		MenuItem item = new MenuItem(name, desc, isVegetarian, price);
		
		menuItems.put(item.getName(), item);
	}
	
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}

}
