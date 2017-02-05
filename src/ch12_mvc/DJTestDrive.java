package ch12_mvc;

public class DJTestDrive {

	public static void main (String[] args) {
        IBeatModel model = new BeatModel();
		IController controller = new BeatController(model);
    }
}
