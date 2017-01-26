package ch09_iterator.v2;

import ch09_iterator.v1.MenuItem;

public class Waitress {

	BreakfastMenu breakfastMenu;
	DinnerMenu dinnerMenu;
	
	public Waitress(BreakfastMenu breakfastMenu, DinnerMenu dinnerMenu) {
		this.breakfastMenu = breakfastMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		Iterator breakfastMenuIterator = breakfastMenu.createIterator();
		Iterator dinnerMenuIterator = dinnerMenu.createIterator();
		
		System.out.println("菜单\n======\n 早餐");
		printMenu(breakfastMenuIterator);
		
		System.out.println("\n 午餐");
		printMenu(dinnerMenuIterator);
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
