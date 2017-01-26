package ch08_template.sort;

/**
 * 这里 compareTo 方法就是一个模板方法
 * 
 * @author by Yang.ZHU
 *	on 2017-1-18
 *
 * 
 * Package&FileName: ch08_template.sort.Duck
 */
public class Duck implements Comparable<Duck> {
	String name;
	int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return name + " ，重(斤)：" + weight;
	}

	public int compareTo(Duck o) {
		if (this.weight > o.weight) {
			return 1;
		} else if (this.weight == o.weight) {
			return 0;
		} else {
			return -1;
		}
		
	}

}
