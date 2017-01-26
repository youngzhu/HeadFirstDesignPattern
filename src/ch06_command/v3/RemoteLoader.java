package ch06_command.v3;

import ch06_command.v2.Light2;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndo control = new RemoteControlWithUndo();
		
		Light2 livingRoomLight = new Light2("卧室");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		
		control.onButtonWasPushed(0);
		control.offButtonWasPushed(0);
		System.out.println(control);
		
		control.undoButtonWasPushed();
		
		control.offButtonWasPushed(0);
		control.onButtonWasPushed(0);
		System.out.println(control);
		
		control.undoButtonWasPushed();
	}
}
