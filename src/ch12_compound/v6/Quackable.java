package ch12_compound.v6;

/**
 * 重新创建Quackable接口
 * 因为需要变成可观察对象
 *
 * @author by Young.ZHU
 *      on 2017年1月27日
 *
 * Package&FileName: ch12_compound.v6.Quackable
 */
public interface Quackable extends QuackObservable {

	void quack();
}
