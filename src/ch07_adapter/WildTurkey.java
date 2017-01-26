package ch07_adapter;

public class WildTurkey implements Turkey {

	public void gobble() {

		System.out.println("咯咯咯……");
	}

	public void fly() {

		System.out.println("我能飞很短的距离");
	}

}
