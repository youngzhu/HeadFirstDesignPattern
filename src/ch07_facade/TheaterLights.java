package ch07_facade;

/**
 * 灯光
 * 
 * @author by Yang.ZHU
 *	on 2017-1-17
 *
 * 
 * Package&FileName: ch07_Facade.TheaterLights
 */
public class TheaterLights {
	String description;

	public TheaterLights(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " 开灯");
	}

	public void off() {
		System.out.println(description + " 关灯");
	}

	public void dim(int level) {
		System.out.println(description + " 调节亮度到 " + level  + "%");
	}

	public String toString() {
		return description;
	}
}
