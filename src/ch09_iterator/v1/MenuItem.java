package ch09_iterator.v1;

/**
 * 菜单项
 * @author by Yang.ZHU
 *	on 2017-1-18
 *
 * 
 * Package&FileName: ch09_iterator.MenuItem
 */
public class MenuItem {
	String name; // 名称
	String desc; // 描述
	boolean vegetarian; // 是否素食
	double price; // 价格
	
	public MenuItem(String name, String desc, boolean vegetarian, double price) {
		this.name = name;
		this.desc = desc;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
	
	
}
