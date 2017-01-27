package ch12_compound.v4;

import ch12_compound.*;
import ch12_compound.v2.*;
import ch12_compound.v3.QuackCounter;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		// 使用“带计数器”的工厂生产的鸭子都会有计数器
		// 不会出现遗漏的情况
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		// 不统计鹅叫的次数
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("**** 带有鸭子工厂的模拟器  ***\n");

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
