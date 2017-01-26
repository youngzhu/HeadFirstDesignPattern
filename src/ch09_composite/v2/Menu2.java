package ch09_composite.v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 菜单（节点）
 * @author by Yang.ZHU
 *	on 2017-1-22
 *
 * 
 * Package&FileName: ch09_composite.Menu
 */
public class Menu2 extends MenuComponent2 {

	List<MenuComponent2> menuComponents = new ArrayList();
	
	String name;
	String description;
	
	public Menu2(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	void add(MenuComponent2 menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	@Override
	void remove(MenuComponent2 menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	@Override
	MenuComponent2 getChild(int i) {
		return menuComponents.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	void print() {
		// 打印菜单本身的信息
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("-------------------");
		
		// 打印该菜单包含的菜单项（或者其他菜单）信息
		Iterator<MenuComponent2> iterator = menuComponents.iterator();
		
		while (iterator.hasNext()) {
			MenuComponent2 mc = iterator.next();
			mc.print();
		}
	}
	
	@Override
	Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
}
