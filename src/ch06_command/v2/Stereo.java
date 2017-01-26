package ch06_command.v2;

/**
 * 音响
 * 
 * @author by Yang.ZHU
 *	on 2017-1-13
 *
 * 
 * Package&FileName: ch06_command.v2.Stereo
 */
public class Stereo {

	public void on() {
		System.out.println("接通音响电源");
	}
	
	public void off() {
		System.out.println("关闭音响电源");
	}
	
	public void setCD() {
		System.out.println("设置成CD模式");
	}
	
	public void setDVD() {
		System.out.println("设置成DVD模式");
	}
	
	public void setRadio() {
		System.out.println("设置成广播模式");
	}
	
	public void setVolume(int vol) {
		System.out.println("设置音量：" + vol);
	}
}
