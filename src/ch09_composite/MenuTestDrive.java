package ch09_composite;

public class MenuTestDrive {

	public static void main(String[] args) {

		MenuComponent breakfastMenu = new Menu("阳光早餐店", "早餐");
		MenuComponent lunchMenu = new Menu("好再来餐厅", "午餐");
		MenuComponent cafeMenu = new Menu("古意香味浓咖啡馆", "晚餐");
		
		MenuComponent dessertMenu = new Menu("甜品", "甜点");
		
		MenuComponent allMenu = new Menu("菜单总览", "所有的菜单");
		
		allMenu.add(breakfastMenu);
		allMenu.add(lunchMenu);
		allMenu.add(cafeMenu);
		
		breakfastMenu.add(new MenuItem("煎饼", "薄饼、鸡蛋和脆饼", 4));
		breakfastMenu.add(new MenuItem("手抓饼", "薄饼、鸡蛋和生菜", 4.5));
		breakfastMenu.add(new MenuItem("花卷", "面团、葱花", 0.8));
		
		
		lunchMenu.add(new MenuItem("牛肉拉面", "拉面和牛肉", 8));
		lunchMenu.add(new MenuItem("例汤", "一碗例汤，配蔬菜沙拉", 12));
		lunchMenu.add(new MenuItem("牛排", "一份牛排，配蔬菜沙拉，加一杯红酒", 888.88));
		
		dessertMenu.add(new MenuItem("苹果派", "就是苹果派，不是美国派", 3.8));
		lunchMenu.add(dessertMenu);
		
		cafeMenu.add(new MenuItem("夏日激情", "一杯星冰乐 + 一个马卡龙", 88));
		cafeMenu.add(new MenuItem("悠然午后", "一杯卡布奇诺 + 一块小蛋糕", 58));
		
		Waitress waitress = new Waitress(allMenu);
		waitress.printMenu();
	}

}
