package ch02_observer.v2;

import java.util.Observable;
import java.util.Observer;

import ch02_observer.DisplayElement;

/**
 * 当前状况布告板
 * 
 * @author by Yang.ZHU
 *	on 2017-1-5
 *
 * 
 * Package&FileName: ch02.CurrentConditionsDisplay
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {
	private Observable observable;
	
	private float temp;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsDisplay2(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void display() {

		System.out.println("当前气象：温度-" + temp + ", 湿度-" + humidity
				+ ", 气压-" + pressure);
	}

	public void update(Observable o, Object arg) {

		if (o instanceof WeatherData2) {
			WeatherData2 wd = (WeatherData2) o;
			
			this.temp = wd.getTemperature();
			this.humidity = wd.getHumidity();
			this.pressure = wd.getPressure();
			
			display();
		}
	}

}
