package ch07_facade;

/**
 * 屏幕
 * 
 * @author by Yang.ZHU
 *	on 2017-1-17
 *
 * 
 * Package&FileName: ch07_Facade.Screen
 */
public class Screen {
	String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " 收起屏幕");
	}

	public void down() {
		System.out.println(description + " 展开屏幕");
	}


	public String toString() {
		return description;
	}
}
