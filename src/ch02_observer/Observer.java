package ch02_observer;

/**
 * 观察者对象/数据显示对象
 * 
 * @author by Yang.ZHU
 *	on 2017-1-5
 *
 * 
 * Package&FileName: ch02.Observer
 */
public interface Observer {

	/**
	 * 
	 * @param temp - 温度
	 * @param humidity - 湿度
	 * @param pressure - 气压
	 */
	void update(float temp, float humidity, float pressure);
}
