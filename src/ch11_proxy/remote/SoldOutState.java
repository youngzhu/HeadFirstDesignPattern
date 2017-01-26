package ch11_proxy.remote;

public class SoldOutState implements State {
	private static final long serialVersionUID = -1478728152162539702L;
	
	transient GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("售罄，暂停营业！");
	}

	public void ejectQuarter() {
		System.out.println("没投币，怎么能退币呢？");
	}

	public void turnCrank() {
		System.out.println("糖果已售完，再怎么摇都没用。");
	}

	public void dispense() {
	}

	public String toString() {
		return "售罄";
	}
}
