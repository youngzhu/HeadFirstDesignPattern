package ch04_factory.v2;

public abstract class PizzaStore2 {
	
	// 每一个披萨店都要有个原料工厂
	PizzaIngredientFactory ingredientFactory;

	public Pizza2 orderPizza(String type) {
		Pizza2 pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	/**
	 * 抽象工厂方法
	 * 
	 * @param type
	 * @return
	 */
	protected abstract Pizza2 createPizza(String type);
}
