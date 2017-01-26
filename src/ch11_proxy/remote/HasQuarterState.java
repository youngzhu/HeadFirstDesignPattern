package ch11_proxy.remote;

import java.util.Random;

public class HasQuarterState implements State {
	private static final long serialVersionUID = 2830042527015527785L;

	transient GumballMachine gumballMachine;
	
	// 随机数生成器
	Random winnerRandom = new Random(System.currentTimeMillis());
 
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
		
		int winner = winnerRandom.nextInt(10);
		if (winner == 0 
				&& gumballMachine.getCount() > 1) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

    public void dispense() {
    }
    
    public void refill() { }
 
	public String toString() {
		return "有币";
	}
	
}
