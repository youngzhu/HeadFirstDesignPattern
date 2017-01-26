package ch06_command.v2;

/**
 * 吊扇
 * @author by Yang.ZHU
 *	on 2017-1-13
 *
 * 
 * Package&FileName: ch06_command.v2.CeilingFan
 */
public class CeilingFan {

	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;
	
	public void high() {
		System.out.println("打开吊扇，风速：高档");
	}
	
	public void medium() {
		System.out.println("打开吊扇，风速：中档");
	}
	
	public void low() {
		System.out.println("打开吊扇，风速：低档");
	}
	
	public void off() {
		System.out.println("关闭吊扇");
	}
}
