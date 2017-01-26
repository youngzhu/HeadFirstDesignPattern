package ch02_observer;

/**
 * 主题（数据）对象
 * 
 * @author by Yang.ZHU
 *	on 2017-1-5
 *
 * 
 * Package&FileName: ch02.Subject
 */
public interface Subject {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	
	/**
	 * 当主题状态改变时，这个方法会被调用，以通知所有的观察者
	 */
	void notifyObserver();
}
