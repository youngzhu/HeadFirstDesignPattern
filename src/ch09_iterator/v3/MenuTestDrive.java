package ch09_iterator.v3;

public class MenuTestDrive {

	public static void main(String[] args) {
		Menu breakfastMenu = new BreakfastMenu();
		Menu dinnerMenu = new DinnerMenu();
		
		Waitress waitress = new Waitress(breakfastMenu, dinnerMenu);
		
		waitress.printMenu();
	}
}
