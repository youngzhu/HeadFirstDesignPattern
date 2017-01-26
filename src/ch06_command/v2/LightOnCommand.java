package ch06_command.v2;

import ch06_command.Command;

public class LightOnCommand implements Command {

	Light2 light;

	public LightOnCommand(Light2 light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
