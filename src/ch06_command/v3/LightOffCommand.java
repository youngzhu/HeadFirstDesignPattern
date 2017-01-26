package ch06_command.v3;

import ch06_command.v2.Light2;

public class LightOffCommand implements Command3 {

	Light2 light;

	public LightOffCommand(Light2 light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}

	/**
	 * 对“关”的命令来说，撤销就是“开”
	 */
	public void undo() {

		light.on();
	}
}
