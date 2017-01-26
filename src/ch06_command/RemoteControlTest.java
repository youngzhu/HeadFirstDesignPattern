package ch06_command;

/**
 * 
 * @author by Yang.ZHU
 *	on 2017-1-12
 *
 * 
 * Package&FileName: ch06_command.RemoteControlTest
 */
public class RemoteControlTest {

	/*
	 * main方法相当于一个”客户“，即命令发起者
	 */
	public static void main(String[] args) {
		/*
		 * 遥控器就是命令的调用者
		 * 相当于”服务员“
		 */
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		/*
		 * 请求的接收者
		 * 相当于”厨师“
		 */
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		
		/*
		 * 具体命令
		 * 相当于”订单“
		 */
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
