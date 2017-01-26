package ch09_iterator.v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ch09_iterator.v1.MenuItem;

/**
 * 使用List来存储菜单
 * 
 * @author by Yang.ZHU
 *	on 2017-1-18
 *
 * 
 * Package&FileName: ch09_iterator.PancakeHouseMenu
 */
public class BreakfastMenu implements Menu {
	List<MenuItem> menuItems;
	
	public BreakfastMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("煎饼", "薄饼、鸡蛋和脆饼", false, 4);
		addItem("手抓饼", "薄饼、鸡蛋和生菜", false, 4.5);
		addItem("花卷", "面团、葱花", false, 0.8);
	}

	private void addItem(String name, String desc
			, boolean isVegetarian, double price) {
		MenuItem item = new MenuItem(name, desc, isVegetarian, price);
		
		menuItems.add(item);
	}
	
//	public List<MenuItem> getMenuItems() {
//		return menuItems;
//	}
	public Iterator createIterator() {
		return menuItems.iterator();
	}
}
