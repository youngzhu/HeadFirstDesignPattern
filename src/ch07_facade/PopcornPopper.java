package ch07_facade;

/**
 * 爆米花机
 * 
 * @author by Yang.ZHU
 *	on 2017-1-17
 *
 * 
 * Package&FileName: ch07_Facade.PopcornPopper
 */
public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " 打开爆米花机");
	}
 
	public void off() {
		System.out.println(description + " 关闭爆米花机");
	}

	public void pop() {
		System.out.println(description + " 开始爆米花");
		System.out.println(description + " 噼里啪啦……嘭……");
		System.out.println(description + " 新鲜爆米花出炉");
	}
 
    public String toString() {
            return description;
    }
}
