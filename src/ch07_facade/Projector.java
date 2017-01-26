package ch07_facade;

/**
 * 投影仪
 * 
 * @author by Yang.ZHU
 *	on 2017-1-17
 *
 * 
 * Package&FileName: ch07_Facade.Projector
 */
public class Projector {

	String description;
	DvdPlayer dvdPlayer;
	
	public Projector(String description, DvdPlayer dvdPlayer) {
		this.description = description;
		this.dvdPlayer = dvdPlayer;
	}
 
	public void on() {
		System.out.println(description + " 打开投影");
	}
 
	public void off() {
		System.out.println(description + " 关闭投影");
	}

	public void wideScreenMode() {
		System.out.println(description + " 设置成宽屏模式 (16x9)");
	}

	public void tvMode() {
		System.out.println(description + " 设置成电视模式 (4x3)");
	}
  
    public String toString() {
            return description;
    }
}
