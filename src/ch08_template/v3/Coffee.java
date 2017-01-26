package ch08_template.v3;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("冲咖啡");
	}

	@Override
	void addCondiments() {
		System.out.println("加糖加牛奶");
	}

}
