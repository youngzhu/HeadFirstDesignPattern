package ch06_command.v5;

import ch06_command.v3.Command3;

public class StereoOffCommand implements Command3 {

	Stereo stereo;
	
	ModelOfStereo prevModel;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		prevModel = stereo.model;
		stereo.off();
	}

	public void undo() {
		Command3 prevCmd = null;
		if (prevModel == ModelOfStereo.CD) {
			prevCmd = new StereoOnWithCDCommand(stereo);
		}
		
		prevCmd.execute();
	}
}
