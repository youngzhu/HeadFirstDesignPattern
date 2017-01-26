package ch06_command.v2;

public class Light2 {
	String location; // 位置
	
	public Light2(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + "的灯亮了");
	}
	
	public void off() {
		System.out.println(location + "的灯灭了");
	}
}
