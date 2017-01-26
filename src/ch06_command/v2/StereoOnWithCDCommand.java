package ch06_command.v2;

import ch06_command.Command;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {

		stereo.on();
		stereo.setCD();
		stereo.setVolume(100);
	}

}
