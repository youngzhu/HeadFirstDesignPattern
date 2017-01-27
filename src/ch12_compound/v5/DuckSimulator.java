package ch12_compound.v5;

import ch12_compound.*;
import ch12_compound.v2.*;
import ch12_compound.v3.*;
import ch12_compound.v4.*;

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

		System.out.println("**** 管理一群鸭子的模拟器  ***\n");

		// 一整群鸭子，包括各种鸭
		Flock flockOfDucks = new Flock();

		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		// 绿头鸭群（只有绿头鸭）
		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		// 把各个绿头鸭加到绿头鸭群里
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		// 把绿头鸭群加到大群里
		flockOfDucks.add(flockOfMallards);

		System.out.println("\n大鸭群===");
		simulate(flockOfDucks);

		System.out.println("\n绿头鸭群====");
		simulate(flockOfMallards);

		System.out.println("\n鸭子共叫了  " + 
		                   QuackCounter.getQuacks() + " 次");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
