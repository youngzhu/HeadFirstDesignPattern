package ch02_observer;

/**
 * 当前状况布告板
 * 
 * @author by Yang.ZHU
 *	on 2017-1-5
 *
 * 
 * Package&FileName: ch02.CurrentConditionsDisplay
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Subject weathData;
	private float temp;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weathData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {

		System.out.println("当前气象：温度-" + temp + ", 湿度-" + humidity
				+ ", 气压-" + pressure);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		
		display();
	}

}
