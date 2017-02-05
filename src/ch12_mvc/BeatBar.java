package ch12_mvc;

import java.awt.Color;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BeatBar extends JProgressBar implements Runnable, ChangeListener { 
	private static final long serialVersionUID = 2L;
	Thread thread;

	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
		
//		 setOrientation(JHORIZONTAL);
		   setMinimum(0);
		   setMaximum(100);
		   setValue(0);
		   setStringPainted(true);
		   addChangeListener(this);
//		   setPreferredSize(new Dimension(300,20));
		   setBorderPainted(true);
		   setBackground(Color.pink);
	}

	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * .75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {};
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {

		
	}
}
