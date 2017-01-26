package ch08_template.sort;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		Duck[] ducks = {new Duck("小白", 3),
				new Duck("小黄", 5),
				new Duck("小黑", 8),
				new Duck("小灰", 3)
		};
		
		System.out.println("排序前：");
		display(ducks);
		
		// 排序
		Arrays.sort(ducks);
		
		System.out.println("排序后：");
		display(ducks);
	}

	private static void display(Duck[] ducks) {

		for(Duck duck : ducks) {
			System.out.println(duck);
		}
	}
}
