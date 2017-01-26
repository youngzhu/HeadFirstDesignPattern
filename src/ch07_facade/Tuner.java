package ch07_facade;

/**
 * 调节器（功放遥控器）
 * 
 * @author by Yang.ZHU
 *	on 2017-1-17
 *
 * 
 * Package&FileName: ch07_Facade.Tuner
 */
public class Tuner {
	String description;
	Amplifier amplifier;
	double frequency;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " 打开");
	}

	public void off() {
		System.out.println(description + " 关闭");
	}

	public void setFrequency(double frequency) {
		System.out.println(description + " 设置频率 " + frequency);
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println(description + " AM");
	}

	public void setFm() {
		System.out.println(description + " FM");
	}

	public String toString() {
		return description;
	}
}
