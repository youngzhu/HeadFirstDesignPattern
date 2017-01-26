package ch12_compound.v4;

import ch12_compound.*;
import ch12_compound.v2.*;
import ch12_compound.v3.QuackCounter;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		// 不统计鹅叫的次数
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("**** 带有计数器的模拟器  ***\n");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("\n鸭子共叫了  " + 
		                   QuackCounter.getQuacks() + " 次");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
