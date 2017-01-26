package ch05_singleton;

/**
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
public class Singleton {

	private static Singleton uniqueInstance;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		
		return uniqueInstance;
	}
}
