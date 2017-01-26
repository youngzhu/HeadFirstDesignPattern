package ch06_command.v2;

import ch06_command.Command;

public class CeilingFanOnCommand implements Command {

	CeilingFan fan;

	public CeilingFanOnCommand(CeilingFan fan) {
		this.fan = fan;
	}

	public void execute() {
		fan.high();
	}
}
