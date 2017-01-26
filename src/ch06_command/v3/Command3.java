package ch06_command.v3;

/**
 * 增加了“撤销”功能
 * 
 * @author by Yang.ZHU
 *	on 2017-1-13
 *
 * 
 * Package&FileName: ch06_command.v3.Command3
 */
public interface Command3 {

	void execute();
	void undo();
}
