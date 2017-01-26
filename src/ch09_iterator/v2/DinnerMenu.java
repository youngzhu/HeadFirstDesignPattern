package ch09_iterator.v2;

import ch09_iterator.v1.MenuItem;

/**
 * 用数组来存放菜单
 * 
 * @author by Yang.ZHU
 *	on 2017-1-18
 *
 * 
 * Package&FileName: ch09_iterator.DinnerMenu
 */
public class DinnerMenu {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("牛肉拉面", "拉面和牛肉", false, 8);
		addItem("例汤", "一碗例汤，配蔬菜沙拉", true, 12);
		addItem("牛排", "一份牛排，配蔬菜沙拉，加一杯红酒", false, 888.88);
	}
	
	private void addItem(String name, String desc
			, boolean isVegetarian, double price) {
		MenuItem item = new MenuItem(name, desc, isVegetarian, price);
		
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("对不起菜单已满！");
		} else {
			menuItems[numberOfItems] = item;
			numberOfItems ++;
		}
	}
	
	// 不需要返回具体的菜单了
	// 只要返回一个迭代器就行
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
