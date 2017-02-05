package ch12_mvc;

public interface IController {

	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
}
