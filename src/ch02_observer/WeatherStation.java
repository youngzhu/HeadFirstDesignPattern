package ch02_observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
		
		wd.setMeasurements(20, 80, 200);
		wd.setMeasurements(-10, 12, 100);
	}
}
