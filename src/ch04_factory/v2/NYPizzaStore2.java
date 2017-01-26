package ch04_factory.v2;

public class NYPizzaStore2 extends PizzaStore2 {

	@Override
	protected Pizza2 createPizza(String type) {
		Pizza2 pizza = null;
		
		// 纽约的披萨店需要一个纽约的原料厂
		ingredientFactory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("纽约风味的披萨");
		} else if (type.equals("veggie")) {
			// ...
		} else {
			return null;
		}
		
		return pizza;
	}

}
