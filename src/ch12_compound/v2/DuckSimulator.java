package ch12_compound.v2;

import ch12_compound.*;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
  
	void simulate() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		// 伪装成鸭子的鹅
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		System.out.println("**** 加了鹅的鸭叫模拟器  ***\n");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
	}
   
	void simulate(Quackable duck) {
		duck.quack();
	}
}
