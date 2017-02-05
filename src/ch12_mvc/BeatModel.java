package ch12_mvc;

import java.util.*;

import javax.sound.midi.*;

public class BeatModel implements IBeatModel, MetaEventListener {
	Sequencer sequencer;
	// 节拍观察者
	ArrayList<IBeatObserver> IBeatObservers = new ArrayList<IBeatObserver>();
	// BPM观察者
	ArrayList<IBPMObserver> IBPMObservers = new ArrayList<IBPMObserver>();
	// 默认BPM 90
	int bpm = 90;
	Sequence sequence;
	Track track;

	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}

	public void on() {
		System.out.println("Starting the sequencer");
		sequencer.start();
		setBPM(90);
	}

	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	public void setBPM(int bpm) {
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
		notifyIBPMObservers();
	}

	public int getBPM() {
		return bpm;
	}

	void beatEvent() {
		notifyIBeatObservers();
	}


	public void registerObserver(IBeatObserver o) {
		IBeatObservers.add(o);
	}

	public void notifyIBeatObservers() {
		for(int i = 0; i < IBeatObservers.size(); i++) {
			IBeatObserver observer = (IBeatObserver)IBeatObservers.get(i);
			observer.updateBeat();
		}
	}

	public void registerObserver(IBPMObserver o) {
		IBPMObservers.add(o);
	}

	public void notifyIBPMObservers() {
		for(int i = 0; i < IBPMObservers.size(); i++) {
			IBPMObserver observer = (IBPMObserver)IBPMObservers.get(i);
			observer.updateBPM();
		}
	}


	public void removeObserver(IBeatObserver o) {
		int i = IBeatObservers.indexOf(o);
		if (i >= 0) {
			IBeatObservers.remove(i);
		}
	}



	public void removeObserver(IBPMObserver o) {
		int i = IBPMObservers.indexOf(o);
		if (i >= 0) {
			IBPMObservers.remove(i);
		}
	}


	public void meta(MetaMessage message) {
		if (message.getType() == 47) {
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}

	public void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence = new Sequence(Sequence.PPQ,4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
			sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 

	public void buildTrackAndStart() {
		int[] trackList = {35, 0, 46, 0};

		sequence.deleteTrack(null);
		track = sequence.createTrack();

		makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));      
		try {
			sequencer.setSequence(sequence);                    
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 

	public void makeTracks(int[] list) {        

		for (int i = 0; i < list.length; i++) {
			int key = list[i];

			if (key != 0) {
				track.add(makeEvent(144,9,key, 100, i));
				track.add(makeEvent(128,9,key, 100, i+1));
			}
		}
	}

	public  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);

		} catch(Exception e) {
			e.printStackTrace(); 
		}
		return event;
	}
}
