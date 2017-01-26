package ch06_command.v5;

import ch06_command.v3.Command3;

public class MacroCommand implements Command3 {
	Command3[] commands;

	public MacroCommand(Command3[] commands) {
		this.commands = commands;
	}

	public void execute() {
		for (Command3 cmd : commands) {
			cmd.execute();
		}
	}

	public void undo() {
		for (Command3 cmd : commands) {
			cmd.undo();
		}
	}

}
