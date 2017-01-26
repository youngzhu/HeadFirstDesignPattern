package ch06_command.v5;

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
	
	ModelOfStereo model;

	public void on() {
		System.out.println("接通音响电源");
	}
	
	public void off() {
		System.out.println("关闭音响电源");
	}
	
	public void setting() {
		if (model == ModelOfStereo.CD) {
			System.out.println("设置成CD模式");
		} else if (model == ModelOfStereo.DVD) {
			System.out.println("设置成DVD模式");
		} else if (model == ModelOfStereo.RADIO) {
			System.out.println("设置成广播模式");
		} else {
			System.out.println("模式错误！请重新设置模式。");
		}
	}
	
	public void setVolume(int vol) {
		System.out.println("设置音量：" + vol);
	}

	public void setModel(ModelOfStereo model) {
		this.model = model;
	}
}
