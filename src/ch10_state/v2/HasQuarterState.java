package ch10_state.v2;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("不能重复投币");
	}
 
	public void ejectQuarter() {
		System.out.println("退币成功");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("准备售出糖果...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
    }
    
    public void refill() { }
 
	public String toString() {
		return "有币";
	}
	
}
