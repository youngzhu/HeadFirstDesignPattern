package ch06_command;

public class GarageDoor {

	public void up() {
		System.out.println("开门");
	}
	
	public void down() {
		System.out.println("关门");
	}
	
	public void stop() {
		System.out.println("stop.");
	}
	
	public void lightOn() {
		System.out.println("打开车库灯");
	}
	
	public void lightOff() {
		System.out.println("关了车库灯");
	}
}
