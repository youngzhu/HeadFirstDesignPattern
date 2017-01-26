package ch07_facade;

/**
 * 功放 
 * 
 * @author by Yang.ZHU
 *	on 2017-1-17
 *
 * 
 * Package&FileName: ch07_Facade.Amplifier
 */
public class Amplifier {

	String description;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + "打开功放");
	}
 
	public void off() {
		System.out.println(description + "关闭功放");
	}
 
	public void setStereoSound() {
		System.out.println(description + " 设置为立体声");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " 设置为环绕立体声");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " 调节音量： " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " 设置遥控器 " + tuner);
		this.tuner = tuner;
	}
  
	public void setDvd(DvdPlayer dvd) {
		System.out.println(description + " 输入模式设置为DVD- " + dvd);
		this.dvd = dvd;
	}
 
	public void setCd(CdPlayer cd) {
		System.out.println(description + " 输入模式设置为CD- " + cd);
		this.cd = cd;
	}
 
	public String toString() {
		return description;
	}
}
