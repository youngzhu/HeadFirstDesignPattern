package ch06_command.v3;

public class RemoteControlWithUndo {
	// 插槽的数目
	private static final int NUM_OF_SLOT = 7;
	
	// 有一对一的”开-关“命令
	Command3[] onCommands;
	Command3[] offCommands;
	Command3 undoCommand;
	
	public RemoteControlWithUndo() {
		onCommands = new Command3[NUM_OF_SLOT];
		offCommands = new Command3[NUM_OF_SLOT];
		
		Command3 noCommand = new NoCommand();
		for (int i = 0; i < NUM_OF_SLOT; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}
	
	/**
	 * 
	 * @param slot - 插槽的序号
	 * @param onCmd - 开命令
	 * @param offCmd - 关命令
	 */
	public void setCommand(int slot, Command3 onCmd, Command3 offCmd) {
		onCommands[slot] = onCmd;
		offCommands[slot] = offCmd;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
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
		sb.append("待撤销命令：")
			.append(undoCommand.getClass().getName());
		
		return sb.toString();
	}
}
