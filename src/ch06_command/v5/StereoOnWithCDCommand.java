package ch06_command.v5;

import ch06_command.v3.Command3;

public class StereoOnWithCDCommand implements Command3 {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		stereo.setModel(ModelOfStereo.CD);
		this.stereo = stereo;
	}

	public void execute() {

		stereo.on();
		stereo.setting();
		stereo.setVolume(100);
	}

	public void undo() {
		stereo.off();
	}

}
