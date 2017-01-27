package ch12_compound.v6;

/**
 * 可被观察的“呱呱叫”的对象
 *
 * @author by Young.ZHU
 *      on 2017年1月27日
 *
 * Package&FileName: ch12_compound.v6.QuackObservable
 */
public interface QuackObservable {

	void registerObserver(Observer observer);
	void notifyObservers();
	
	// 为了简便，省略了删除观察者的方法
}
