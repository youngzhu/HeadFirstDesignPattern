package ch02_observer.v2;

public class WeatherStation2 {

	public static void main(String[] args) {
		WeatherData2 wd = new WeatherData2();
		
		CurrentConditionsDisplay2 ccd = new CurrentConditionsDisplay2(wd);
		ForecastDisplay fd = new ForecastDisplay(wd);
		
		wd.setMeasurements(20, 80, 200);
		wd.setMeasurements(-10, 12, 100);
	}
}
