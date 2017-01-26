package ch04_factory;

public class PizzaTestDrive {

	public static void main(String[] args) {

		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoStore();
		
		Pizza pizza1 = nyStore.orderPizza("cheese");
		System.out.println("张三定了一个 " + pizza1.name);
		
		System.out.println("--------------------");
		
		Pizza pizza2 = chicagoStore.orderPizza("cheese");
		System.out.println("李四和王二麻子定了一个 " + pizza2.name);
	}

}
