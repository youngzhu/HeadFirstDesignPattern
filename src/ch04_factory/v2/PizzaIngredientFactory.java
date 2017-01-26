package ch04_factory.v2;

import java.util.List;

/**
 * 原料工厂
 * 
 * @author by Yang.ZHU
 *	on 2017-1-11
 *
 * 
 * Package&FileName: ch04_factory.v2.PizzaIngredientFactory
 */
public interface PizzaIngredientFactory {

	Dough createDough();
	// 方便起见（懒……），没有创建对象，
	// 用字符串代替
	String createSauce();
	List<String> createToppings();
}
