package ch04_factory.v2;

import java.util.ArrayList;
import java.util.List;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

	/**
	 * 芝加哥的喜欢厚面饼
	 */
	public Dough createDough() {
		return new ThickDough();
	}

	public String createSauce() {
		return "小番茄酱";
	}

	public List<String> createToppings() {
		List<String> toppings = new ArrayList<String>();
		
		toppings.add("白干酪");
		toppings.add("火腿肠");
		
		return toppings;
	}

}
