package ch02_observer.v2;

import java.util.Observable;
import java.util.Observer;

import ch02_observer.DisplayElement;

/**
 * 天气预报
 * 
 * @author by Yang.ZHU
 *	on 2017-1-6
 *
 * 
 * Package&FileName: ch02.v2.ForecastDisplay
 */
public class ForecastDisplay implements Observer, DisplayElement {
	Observable observable;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public void display() {
		System.out.print("天气预报: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	public void update(Observable o, Object arg) {

		if (o instanceof WeatherData2) {
			WeatherData2 wd = (WeatherData2) o;
			
			lastPressure = currentPressure;
			currentPressure = wd.getPressure();
			
			display();
		}
	}

}
