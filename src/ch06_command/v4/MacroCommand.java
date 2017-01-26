package ch06_command.v4;

import ch06_command.Command;

public class MacroCommand implements Command {
	Command[] commands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	public void execute() {
		for (Command cmd : commands) {
			cmd.execute();
		}
	}

}
