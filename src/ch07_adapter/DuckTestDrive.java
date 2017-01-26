package ch07_adapter;


/**
 * 让火鸡伪装成鸭子
 * 
 * @author by Yang.ZHU
 *	on 2017-1-16
 *
 * 
 * Package&FileName: ch07_Adapter.DuckTestDrive
 */
public class DuckTestDrive {
	
	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		
		System.out.println("--火鸡--");
		turkey.gobble();
		turkey.fly();
		
		// 让火鸡伪装成鸭子
		
		// 这个方法只能调“鸭子”
		// “火鸡”是不行的
//		testDuck(turkey);
		
		// 把“火鸡”伪装成“鸭”
		Duck fuckDuck = new TurkeyAdapter(turkey);
		System.out.println("--火鸡伪装成了鸭子--");
		testDuck(fuckDuck);
	}
	
	/**
	 * 这个方法只能是“鸭子”进
	 * 
	 * @param duck
	 */
	static void testDuck(Duck duck) {
		System.out.println("--鸭子--");
		duck.quack();
		duck.fly();
	}
	
}
