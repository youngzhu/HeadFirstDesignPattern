package ch11_proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * 图像代理（虚拟代理）
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch11_proxy.virtual.ImageProxy
 */
public class ImageProxy implements Icon {

	// 真正的图片对象（被代理对象）
	volatile ImageIcon imageIcon;
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
     
	public ImageProxy(URL url) { imageURL = url; }
     
	// 在真正的对象被创建前，返回默认的高度和宽度
	public int getIconWidth() {
		if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
			return 400;
		}
	}
 
	public int getIconHeight() {
		if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
			return 300;
		}
	}
	
	synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
     
	public void paintIcon(final Component c, Graphics  g, int x,  int y) {
		if (imageIcon != null) {
			// 如果图片对象已被创建
			// 则让他画出自己
			imageIcon.paintIcon(c, g, x, y);
		} else {
			// 否则调用代理
			g.drawString("正在奋力加载，请稍后...", x+150, y+150);
			
			// 如果还没有获取图像（创建真正的图片对象）
			if (!retrieving) {
				// 那么就去获取（创建）
				retrieving = true;

				// 新起一个线程通过网络取获取图片
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							// 为了模拟网络加载
							// 做了延迟 
							Thread.sleep(2000);
//							System.out.println(imageURL);
							setImageIcon(new ImageIcon(imageURL, "Image View"));
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

}
