package ch07_facade;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("youngzy 牌功放");
		Tuner tuner = new Tuner("youngzy 牌调节器", amp);
		DvdPlayer dvd = new DvdPlayer("youngzy 牌DVD播放器", amp);
		CdPlayer cd = new CdPlayer("youngzy 牌CD播放器", amp);
		Projector projector = new Projector("youngzy 牌投影仪", dvd);
		TheaterLights lights = new TheaterLights("youngzy 牌照明");
		Screen screen = new Screen("youngzy 牌屏幕");
		PopcornPopper popper = new PopcornPopper("youngzy 牌爆米花机");
 
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, lights, screen, popper);
 
		homeTheater.watchMovie("《暗战》");
		homeTheater.endMovie();
	}
}
