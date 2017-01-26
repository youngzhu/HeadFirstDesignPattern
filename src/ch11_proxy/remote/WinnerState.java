package ch11_proxy.remote;

public class WinnerState implements State {
	private static final long serialVersionUID = -3099282767528031871L;
	
	transient GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
	}
 
	public void ejectQuarter() {
	}
 
	public void turnCrank() {
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("吼吼吼，您将获得2颗糖。");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	System.out.println("啊，糖果已经卖完了。");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
	public void refill() { }
	
	public String toString() {
		return "给你2颗糖，您是个幸运儿！";
	}
	
}
