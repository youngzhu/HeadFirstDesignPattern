package ch01_strategy;

public class MuteQuack implements IQuackBehavior {

	public void quack() {

		System.out.println("<< 不会叫 >>");
	}

}
