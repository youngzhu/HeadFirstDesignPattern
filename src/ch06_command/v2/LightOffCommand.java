package ch06_command.v2;

import ch06_command.Command;

public class LightOffCommand implements Command {

	Light2 light;

	public LightOffCommand(Light2 light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
