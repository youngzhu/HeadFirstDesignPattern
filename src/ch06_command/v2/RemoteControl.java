package ch06_command.v2;

import ch06_command.Command;

public class RemoteControl {
	// 插槽的数目
	private static final int NUM_OF_SLOT = 7;
	
	// 有一对一的”开-关“命令
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[NUM_OF_SLOT];
		offCommands = new Command[NUM_OF_SLOT];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < NUM_OF_SLOT; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
	}
	
	/**
	 * 
	 * @param slot - 插槽的序号
	 * @param onCmd - 开命令
	 * @param offCmd - 关命令
	 */
	public void setCommand(int slot, Command onCmd, Command offCmd) {
		onCommands[slot] = onCmd;
		offCommands[slot] = offCmd;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n----------远程遥控器-------------\n");
		
		for (int i = 0; i < NUM_OF_SLOT; i++) {
			sb.append("插槽-" + i + ": ")
				.append(onCommands[i].getClass().getName())
				.append("\t")
				.append(offCommands[i].getClass().getName())
				.append("\n");
		}
		
		return sb.toString();
	}
}
