package ch09_composite;

/**
 * 之所以用抽象类，而不是接口
 * 是为了给某些方法提供默认实现
 * 
 * 例如，叶子节点就不该有 getChild 方法
 * 这样，创建叶子节点类时就不用写这个方法了
 * 而节点类，本来就该覆盖这个方法
 * 
 * @author by Yang.ZHU
 *	on 2017-1-22
 *
 * 
 * Package&FileName: ch09_composite.MenuComponent
 */
public abstract class MenuComponent {

	void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	String getName() {
		throw new UnsupportedOperationException();
	}
	
	String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	void print() {
		throw new UnsupportedOperationException();
	}
}
