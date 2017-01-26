package ch09_composite;

/**
 * 菜单项（叶子节点）
 * 
 * @author by Yang.ZHU
 *	on 2017-1-22
 *
 * 
 * Package&FileName: ch09_composite.MenuItem
 */
public class MenuItem extends MenuComponent {

	String name;
	String description;
	double price;
	
	public MenuItem(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}
	
	@Override
	void print() {
		System.out.print("\t" + getName());
		System.out.print(", RMB " + getPrice());
		System.out.println("\n\t\t--" + getDescription());
	}
}
