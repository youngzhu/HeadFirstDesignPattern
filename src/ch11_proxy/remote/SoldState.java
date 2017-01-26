package ch11_proxy.remote;

public class SoldState implements State {
	private static final long serialVersionUID = -190614235621982663L;
	
	transient GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("请稍等，我们正在售出糖果！");
	}
 
	public void ejectQuarter() {
		System.out.println("对不起，糖果已售出不能退币！");
	}
 
	public void turnCrank() {
		System.out.println("正在出售糖果，稍安勿躁！");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("啊！糖果买完了！！");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "发放糖果";
	}
	
}
