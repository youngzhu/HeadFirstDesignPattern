package ch04_factory.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 跟 Pizza 类相比，
 * 1. 将原料“面团”换成对象，由原料工厂生产（方便起见，没有都改，说白了就是懒……）
 * 2. 将 prepare 方法改成抽象的
 * 
 * @author by Yang.ZHU
 *	on 2017-1-11
 *
 * 
 * Package&FileName: ch04_factory.v2.Pizza2
 */
public abstract class Pizza2 {

	String name;
	Dough dough; // 面团
	String sauce; // 酱料
	List<String> toppings = new ArrayList<String>(); // 作料
	
	/**
	 * 准备
	 */
	abstract void prepare();
//	void prepare() {
//		System.out.println("准备 " + name);
//		System.out.println("撒面粉……");
//		System.out.println("加酱料……");
//		System.out.println("加作料：");
//		
//		for (String topping : toppings) {
//			System.out.println("\t" + topping);
//		}
//	}
	
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

	public void setName(String name) {
		this.name = name;
	}
}
