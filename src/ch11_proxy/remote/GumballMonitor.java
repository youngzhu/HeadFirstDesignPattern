package ch11_proxy.remote;

import java.rmi.RemoteException;

public class GumballMonitor {

	GumballMachineRemote machine;
	 
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
 
	public void report() {
		try {
			System.out.println("糖果机 - 位置: " + machine.getLocation());
			System.out.println("\t剩余糖果量: " + machine.getCount());
			System.out.println("\t状态: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
