package ch12_compound.v2;

import ch12_compound.Quackable;

/**
 * 鹅的适配器
 * 
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch12_compound.v2.GooseAdapter
 */
public class GooseAdapter implements Quackable {
	
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	public void quack() {

		goose.honk();
	}

}
