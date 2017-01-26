package ch08_template.v3;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("泡茶");
	}

	@Override
	void addCondiments() {
		System.out.println("加柠檬");
	}
}
