package ch04_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

	String name;
	String dough; // 面团
	String sauce; // 酱料
	List<String> toppings = new ArrayList<String>(); // 作料
	
	/**
	 * 准备
	 */
	void prepare() {
		System.out.println("准备 " + name);
		System.out.println("撒面粉……");
		System.out.println("加酱料……");
		System.out.println("加作料：");
		
		for (String topping : toppings) {
			System.out.println("\t" + topping);
		}
	}
	
	/**
	 * 烘焙
	 */
	void bake() {
		System.out.println("烘焙……高火25分钟");
	}
	
	/**
	 * 切片
	 */
	void cut() {
		System.out.println("切片……");
	}
	
	/**
	 * 装盒
	 */
	void box() {
		System.out.println("打包装盒……");
	}
}
