package ch06_command.v3;

/**
 * 吊扇
 * @author by Yang.ZHU
 *	on 2017-1-13
 *
 * 
 * Package&FileName: ch06_command.v2.CeilingFan
 */
public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	int speed; // 记录吊扇当前的速度
	
	public void high() {
		speed = HIGH;
		System.out.println("打开吊扇，风速：高档");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println("打开吊扇，风速：中档");
	}
	
	public void low() {
		speed = LOW;
		System.out.println("打开吊扇，风速：低档");
	}
	
	public void off() {
		speed = OFF;
		System.out.println("关闭吊扇");
	}

	public int getSpeed() {
		return speed;
	}
}
