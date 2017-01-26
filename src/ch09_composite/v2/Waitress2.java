package ch09_composite.v2;

import java.util.Iterator;

public class Waitress2 {

	MenuComponent2 allMenus;

	public Waitress2(MenuComponent2 allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	/**
	 * 打印10元以下的菜单
	 */
	public void printEconomyMunu() {
		Iterator it = allMenus.createIterator();
		
		System.out.println("经济型菜单\n===");
		while (it.hasNext()) {
			MenuComponent2 mc = (MenuComponent2) it.next();
			
			try {
				if (mc.getPrice() < 10) {
					mc.print();
				}
			} catch (UnsupportedOperationException uoe) {
				
			}
		}
		
	}
}
