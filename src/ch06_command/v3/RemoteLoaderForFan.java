package ch06_command.v3;

public class RemoteLoaderForFan {

	public static void main(String[] args) {
		RemoteControlWithUndo control = new RemoteControlWithUndo();
		
		CeilingFan fan = new CeilingFan();
		
		CeilingFanOnHighCommand fanOnHigh = new CeilingFanOnHighCommand(fan);
		CeilingFanOnMediumCommand fanOnMedium = new CeilingFanOnMediumCommand(fan);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
		
		// 0 - 高速
		control.setCommand(0, fanOnHigh, fanOff);
		// 1 - 中档
		control.setCommand(1, fanOnMedium, fanOff);
		
		control.onButtonWasPushed(0);
		control.offButtonWasPushed(0);
		System.out.println(control);
		
		control.undoButtonWasPushed();
		
		control.onButtonWasPushed(1);
		System.out.println(control);
		
		control.undoButtonWasPushed();
	}
}
