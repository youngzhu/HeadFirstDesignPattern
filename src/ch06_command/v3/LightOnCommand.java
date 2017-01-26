package ch06_command.v3;

import ch06_command.v2.Light2;

public class LightOnCommand implements Command3 {

	Light2 light;

	public LightOnCommand(Light2 light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}

	public void undo() {

		light.off();
	}
}
