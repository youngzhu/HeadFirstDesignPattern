package ch08_template.v4;

public class BeverageTestDrive {

	public static void main(String[] args) {
		TeaWithHook tea = new TeaWithHook();
		CoffeeWithHook coffee = new CoffeeWithHook();
		
		System.out.println("泡茶…… ");
		tea.prepareRecipe();
		
		System.out.println("\n冲咖啡……");
		coffee.prepareRecipe();
	}
}
