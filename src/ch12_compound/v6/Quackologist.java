package ch12_compound.v6;

import java.util.Date;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {

		System.out.println("记录：" + new Date() + ", " + duck + "叫了");
	}

}
