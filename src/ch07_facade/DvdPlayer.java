package ch07_facade;

/**
 * DVD 播放器
 * 
 * @author by Yang.ZHU
 *	on 2017-1-17
 *
 * 
 * Package&FileName: ch07_Facade.DvdPlayer
 */
public class DvdPlayer {
	String description;
	int currentTrack;
	Amplifier amplifier;
	String movie;
	
	public DvdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " 打开DVD");
	}
 
	public void off() {
		System.out.println(description + " 关闭DVD");
	}

    public void eject() {
    	movie = null;
        System.out.println(description + " 弹出");
    }
 
	public void play(String movie) {
		this.movie = movie;
		currentTrack = 0;
		System.out.println(description + " 播放影片 \"" + movie + "\"");
	}

	public void play(int track) {
		if (movie == null) {
			System.out.println(description + " 还没选择影片，不能记忆播放");
		} else {
			currentTrack = track;
			System.out.println(description + " 记忆播放：\"" + movie + "\" 的" + currentTrack + "%");
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + " 停止播放 \"" + movie + "\"");
	}
 
	public void pause() {
		System.out.println(description + " 暂停 \"" + movie + "\"");
	}

	public void setTwoChannelAudio() {
		System.out.println(description + " 设置双声道");
	}
 
	public void setSurroundAudio() {
		System.out.println(description + " 设置环绕立体声");
	}
 
	public String toString() {
		return description;
	}
}
