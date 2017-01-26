package ch06_command.v2;

import ch06_command.Command;
import ch06_command.GarageDoor;

public class GarageDoorUpCommand implements Command {

	GarageDoor door;

	public GarageDoorUpCommand(GarageDoor door) {
		this.door = door;
	}

	public void execute() {
		door.up();
	}
}
