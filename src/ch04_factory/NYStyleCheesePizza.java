package ch04_factory;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "纽约风味的披萨";
		dough = "薄饼";
		sauce = "大蒜番茄酱";
		
		toppings.add("意大利高级奶酪");
	}
}
