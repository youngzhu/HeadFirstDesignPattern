package ch04_factory.v2;

public class PizzaTestDrive2 {

	public static void main(String[] args) {

		PizzaStore2 nyStore = new NYPizzaStore2();
		PizzaStore2 chicagoStore = new ChicagoStore2();
		
		Pizza2 pizza1 = nyStore.orderPizza("cheese");
		System.out.println("张三定了一个 " + pizza1.name);
		
		System.out.println("--------------------");
		
		Pizza2 pizza2 = chicagoStore.orderPizza("cheese");
		System.out.println("李四和王二麻子定了一个 " + pizza2.name);
	}

}
