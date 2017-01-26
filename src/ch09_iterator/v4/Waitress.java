package ch09_iterator.v4;

import java.util.Iterator;

import ch09_iterator.v1.MenuItem;
import ch09_iterator.v3.Menu;

public class Waitress {

	Menu breakfastMenu;
	Menu dinnerMenu;
	Menu cafeMenu;
	
	public Waitress(Menu breakfastMenu, Menu dinnerMenu, Menu cafeMenu) {
		this.breakfastMenu = breakfastMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator breakfastMenuIterator = breakfastMenu.createIterator();
		Iterator dinnerMenuIterator = dinnerMenu.createIterator();
		Iterator cafeMenuIterator = cafeMenu.createIterator();
		
		System.out.println("菜单\n======\n 早餐");
		printMenu(breakfastMenuIterator);
		
		System.out.println("\n 午餐");
		printMenu(dinnerMenuIterator);
		
		System.out.println("\n 下午茶");
		printMenu(cafeMenuIterator);
	}

	private void printMenu(Iterator menuIterator) {
		while (menuIterator.hasNext()) {
			MenuItem item = (MenuItem)menuIterator.next();
			System.out.print(item.getName() + ", ");
			System.out.print(item.getPrice() + " RMB -- ");
			System.out.println(item.getDesc());
		}
	}
}
