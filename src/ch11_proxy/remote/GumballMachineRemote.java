package ch11_proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 糖果机的远程接口
 * 
 * @author by Yang.ZHU
 *	on 2017-1-24
 *
 * 
 * Package&FileName: ch11_proxy.GumballMachineRemote
 */
public interface GumballMachineRemote extends Remote {

	int getCount() throws RemoteException;
	String getLocation() throws RemoteException;
	State getState() throws RemoteException;
}
