package ch06_command.v2;

import ch06_command.GarageDoor;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		
		Light2 livingRoomLight = new Light2("卧室");
		Light2 kitchenLight = new Light2("厨房");
		CeilingFan fan = new CeilingFan();
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand fanOn = new CeilingFanOnCommand(fan);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
		
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		control.setCommand(1, kitchenLightOn, kitchenLightOff);
		control.setCommand(2, fanOn, fanOff);
		control.setCommand(3, garageDoorUp, garageDoorDown);
		control.setCommand(4, stereoOnWithCD, stereoOff);
		
		System.out.println(control);
		
		control.onButtonWasPushed(0);
		control.offButtonWasPushed(0);
		
		control.onButtonWasPushed(1);
		control.offButtonWasPushed(1);
		
		control.onButtonWasPushed(2);
		control.offButtonWasPushed(2);
		
		control.onButtonWasPushed(3);
		control.offButtonWasPushed(3);
		
		control.onButtonWasPushed(4);
		control.offButtonWasPushed(4);
	}
}
