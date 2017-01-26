package ch04_factory.v2;

public class CheesePizza extends Pizza2 {
	// 原料工厂
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("准备 " + name);
		dough = ingredientFactory.createDough();
		System.out.println(dough);
		sauce = ingredientFactory.createSauce();
		System.out.println(sauce);
		toppings = ingredientFactory.createToppings();
		System.out.println("加作料：");
		
		for (String topping : toppings) {
			System.out.println("\t" + topping);
		}
	}

}
