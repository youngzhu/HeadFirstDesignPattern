package ch08_template.v4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("泡茶");
	}

	@Override
	void addCondiments() {
		System.out.println("加柠檬");
	}
	
	@Override
	boolean customerWantsCondiments() {
		// 根据用户的输入来决定是否加调味品
		String answer = getUserInput();
		
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;
		
		System.out.println("请问需要加柠檬吗？(y/n)");
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		} catch (Exception e) {
			
		}
		
		if (answer == null) {
			return "no";
		}
		
		return answer;
	}
}
