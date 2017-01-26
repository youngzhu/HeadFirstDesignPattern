package ch06_command.v2;

import ch06_command.Command;

public class CeilingFanOffCommand implements Command {

	CeilingFan fan;

	public CeilingFanOffCommand(CeilingFan fan) {
		this.fan = fan;
	}

	public void execute() {
		fan.off();
	}
}
