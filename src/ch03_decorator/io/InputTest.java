package ch03_decorator.io;

import java.io.BufferedInputStream;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		int c;
		
		try {
			InputStream fis = InputTest.class.getResourceAsStream("test.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			InputStream lcis = new LowerCaseInputStream(fis);
			
			System.out.println("源文件：");
			lcis.mark(0);
			while ((c = bis.read()) >= 0) {
				System.out.print((char)c);
			}
			
			// 需要调用reset，否则没有内容
			// 同时还有上面的mark方法
			lcis.reset();
			System.out.println();
			System.out.println("转换后：");
			while ((c = lcis.read()) >= 0) {
				System.out.print((char)c);
			}
			
			lcis.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
