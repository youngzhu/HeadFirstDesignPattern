package ch08_template.frame;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		String msg = "涂鸦";
		g.drawString(msg, 150, 150);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("模板方法模式-JFrame");
	}
}
