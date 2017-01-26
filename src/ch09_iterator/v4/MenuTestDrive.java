package ch09_iterator.v4;

import ch09_iterator.v3.BreakfastMenu;
import ch09_iterator.v3.DinnerMenu;
import ch09_iterator.v3.Menu;

public class MenuTestDrive {

	public static void main(String[] args) {
		Menu breakfastMenu = new BreakfastMenu();
		Menu dinnerMenu = new DinnerMenu();
		Menu cafeMenu = new CafeMenu();
		
		Waitress waitress = new Waitress(breakfastMenu, dinnerMenu, cafeMenu);
		
		waitress.printMenu();
	}
}
