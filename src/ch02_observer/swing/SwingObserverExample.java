package ch02_observer.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			System.out.println("别做，做了你会后悔的！");
		}
		
	}
	
	class DevilListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			System.out.println("快来，干起来吧！！");
		}
		
	}
}
