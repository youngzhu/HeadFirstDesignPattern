package ch06_command.v5;

import ch06_command.v2.Light2;
import ch06_command.v3.Command3;
import ch06_command.v3.LightOffCommand;
import ch06_command.v3.LightOnCommand;
import ch06_command.v3.RemoteControlWithUndo;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControlWithUndo control = new RemoteControlWithUndo();
		
		Light2 livingRoomLight = new Light2("卧室");
		Stereo stereo = new Stereo();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		Command3[] macroOn = {livingRoomLightOn, stereoOnWithCD};
		Command3[] macroOff = {livingRoomLightOff, stereoOff};
		
		MacroCommand macroCmdOn = new MacroCommand(macroOn);
		MacroCommand macroCmdOff = new MacroCommand(macroOff);
		
		control.setCommand(0, macroCmdOn, macroCmdOff);
		
		System.out.println(control);
		System.out.println("--组合开关：开--");
		control.onButtonWasPushed(0);
		
//		System.out.println("--组合开关：关--");
//		control.offButtonWasPushed(0);
		
		System.out.println("--撤销--");
		control.undoButtonWasPushed();
		
		// 不支持再次撤销
//		System.out.println("--再次撤销--");
//		control.undoButtonWasPushed();
	}
}
