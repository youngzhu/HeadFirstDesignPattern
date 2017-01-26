package ch06_command.v4;

import ch06_command.Command;
import ch06_command.v2.Light2;
import ch06_command.v2.LightOffCommand;
import ch06_command.v2.LightOnCommand;
import ch06_command.v2.RemoteControl;
import ch06_command.v2.Stereo;
import ch06_command.v2.StereoOffCommand;
import ch06_command.v2.StereoOnWithCDCommand;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		
		Light2 livingRoomLight = new Light2("卧室");
		Stereo stereo = new Stereo();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		Command[] macroOn = {livingRoomLightOn, stereoOnWithCD};
		Command[] macroOff = {livingRoomLightOff, stereoOff};
		
		MacroCommand macroCmdOn = new MacroCommand(macroOn);
		MacroCommand macroCmdOff = new MacroCommand(macroOff);
		
		control.setCommand(0, macroCmdOn, macroCmdOff);
		
		System.out.println(control);
		System.out.println("--组合开关：开--");
		control.onButtonWasPushed(0);
		
		System.out.println("--组合开关：关--");
		control.offButtonWasPushed(0);
		
	}
}
