package ch07_facade;

/**
 * CD 播放器
 * 
 * @author by Yang.ZHU
 *	on 2017-1-17
 *
 * 
 * Package&FileName: ch07_Facade.CdPlayer
 */
public class CdPlayer {
	String description;
	int currentTrack;
	Amplifier amplifier;
	String title;
	
	public CdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " 打开");
	}
 
	public void off() {
		System.out.println(description + " 关闭");
	}

	public void eject() {
		title = null;
		System.out.println(description + " 弹出");
	}
 
	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		System.out.println(description + " 正在播放 \"" + title + "\"");
	}

	public void play(int track) {
		if (title == null) {
			System.out.println(description + " 请放入CD");
		} else {
			currentTrack = track;
			System.out.println(description + " 记忆播放 " + currentTrack);
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + " 停止播放");
	}
 
	public void pause() {
		System.out.println(description + " 暂停播放  \"" + title + "\"");
	}
 
	public String toString() {
		return description;
	}
}
