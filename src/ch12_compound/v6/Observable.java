package ch12_compound.v6;

import java.util.*;

/**
 * Observable 辅助类
 * 
 * Quackable 的每一个实现类中都必须实现“注册”和“通知”的方法
 * 
 * 所以这里创建一个辅助类，用来封装注册和通知的代码
 * QuackObservable实现类的调用就可以委托给这个辅助类
 *
 * @author by Young.ZHU
 *      on 2017年1月27日
 *
 * Package&FileName: ch12_compound.v6.Observable
 */
public class Observable implements QuackObservable {
	// 观察者
	ArrayList<Observer> observers = new ArrayList<Observer>();
	// 被观察者
	QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
  
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}

}
