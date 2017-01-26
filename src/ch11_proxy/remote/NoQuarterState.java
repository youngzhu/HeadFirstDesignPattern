package ch11_proxy.remote;

public class NoQuarterState implements State {
	private static final long serialVersionUID = 231772714051556198L;
	
	transient GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("投币成功！");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("您还没投币呢");
	}
 
	public void turnCrank() {
		System.out.println("你还没投币呢，是摇不出糖果的。");
	 }
 
	public void dispense() {
	} 
	
	public String toString() {
		return "等待投币";
	}
	
}
