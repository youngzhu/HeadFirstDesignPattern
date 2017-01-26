package ch11_proxy.virtual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {

	ImageComponent imageComponent;
	JFrame frame = new JFrame("Image Viewer");
	JMenuBar menuBar;
	JMenu menu;
	static final Hashtable<String, String> IMAGES = new Hashtable<String, String>();
	
	static {
		IMAGES.put("蓝山", "resources\\images\\Blue hills.jpg");
		IMAGES.put("日出", "resources\\images\\Sunset.jpg");
		IMAGES.put("水仙", "resources\\images\\Water lilies.jpg");
		IMAGES.put("冬季", "resources\\images\\Winter.jpg");
	}

	public static void main (String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception{

		URL initialURL = getImageUrl("蓝山");
		menuBar = new JMenuBar();
		menu = new JMenu("收藏的图片");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = IMAGES.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem); 
//			System.out.println(1);
			
			menuItem.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
//					System.out.println(e.getActionCommand());
					imageComponent.setIcon(new ImageProxy(getImageUrl(e.getActionCommand())));
					frame.repaint();
				}
			});
			
			/* since Java 8
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
				frame.repaint();
			});
			*/
		}

		// set up frame and menus

		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);

	}

	URL getImageUrl(String name) {
		try {
			String path = System.getProperty("user.dir");
			String relativePath = IMAGES.get(name);
			
			String url = path + "\\" + relativePath;
			
			return new URL("file:///" + url);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
