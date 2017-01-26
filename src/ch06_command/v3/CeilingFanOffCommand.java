package ch06_command.v3;

public class CeilingFanOffCommand implements Command3 {

	CeilingFan fan;
	
	int prevSpeed; // 记录之前的速度

	public CeilingFanOffCommand(CeilingFan fan) {
		this.fan = fan;
	}

	public void execute() {
		// 记录之前的状态，便于撤销
		prevSpeed = fan.getSpeed();
		fan.off();
	}

	/**
	 * 将速度设置为之前的值，达到撤销的目的
	 */
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			fan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			fan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			fan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			fan.off();
		}
	}
}
