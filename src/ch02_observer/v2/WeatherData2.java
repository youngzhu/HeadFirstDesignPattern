package ch02_observer.v2;

import java.util.Observable;

/**
 * 气象数据
 * 
 * @author by Yang.ZHU
 *	on 2017-1-5
 *
 * 
 * Package&FileName: ch02.WeatherData
 */
public class WeatherData2 extends Observable {
	private float temperature; // 温度
	private float humidity; // 湿度
	private float pressure; // 气压
	
	/**
	 * 当数据有变动时，通知观察者
	 */
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperetrue, float humidity
			, float pressure) {
		this.temperature = temperetrue;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
