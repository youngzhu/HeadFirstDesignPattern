package ch04_factory.v2;

import java.util.ArrayList;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	/**
	 * 纽约的是薄饼
	 */
	public Dough createDough() {
		return new ThinDough();
	}

	public String createSauce() {
		return "大蒜番茄酱";
	}

	public List<String> createToppings() {
		List<String> toppings = new ArrayList<String>();
		
		toppings.add("意大利高级奶酪");
		
		return toppings;
	}

}
