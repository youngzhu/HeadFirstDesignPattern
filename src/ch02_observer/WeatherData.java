package ch02_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象数据
 * 
 * @author by Yang.ZHU
 *	on 2017-1-5
 *
 * 
 * Package&FileName: ch02.WeatherData
 */
public class WeatherData implements Subject {
	private List<Observer> observerList; // 注册的观察者
	private float temperature; // 温度
	private float humidity; // 湿度
	private float pressure; // 气压
	
	public WeatherData() {
		observerList = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {

		observerList.add(o);
	}

	public void removeObserver(Observer o) {

		int i = observerList.indexOf(o);
		if (i >= 0) {
			observerList.remove(i);
		}
	}

	public void notifyObserver() {

		for(Observer o : observerList) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	/**
	 * 当数据有变动时，通知观察者
	 */
	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(float temperetrue, float humidity
			, float pressure) {
		this.temperature = temperetrue;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
}
