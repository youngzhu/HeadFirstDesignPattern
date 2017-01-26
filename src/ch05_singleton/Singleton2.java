package ch05_singleton;

/**
 * 
 * v2.0
 * 处理多线程，最简单的方式就是使用 synchronized
 * 
 * 但这也有一个问题：
 * 一单创建好实例变量，后面就不需要同步这块代码了。之后的每次调用，同步都是一种累赘。
 * 
 * 同步一个方法可能造成效率下降100倍。
 * 
 * ***********************************
 * 
 * 单例 v1.0
 * 
 * 有个问题：多线程环境中可能生成多个实例
 * 
 * @author by Yang.ZHU
 *	on 2017-1-12
 *
 * 
 * Package&FileName: ch05_singleton.Singleton
 */
public class Singleton2 {

	private static Singleton2 uniqueInstance;
	
	private Singleton2() {};
	
	public static synchronized Singleton2 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton2();
		}
		
		return uniqueInstance;
	}
}
