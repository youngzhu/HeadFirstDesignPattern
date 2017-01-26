package ch09_iterator.v2;

public class MenuTestDrive {

	public static void main(String[] args) {
		BreakfastMenu breakfastMenu = new BreakfastMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		
		Waitress waitress = new Waitress(breakfastMenu, dinnerMenu);
		
		waitress.printMenu();
	}
}
