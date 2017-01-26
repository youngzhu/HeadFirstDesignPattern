package ch01_strategy.v2;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck2 model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
