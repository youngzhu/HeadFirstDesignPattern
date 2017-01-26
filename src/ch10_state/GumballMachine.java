package ch10_state;

/**
 * 糖果机
 * 
 * @author by Yang.ZHU
 *	on 2017-1-23
 *
 * 
 * Package&FileName: ch10_state.GumballMachine
 */
public class GumballMachine {

	/**
	 * 售罄
	 */
	final static int SOLD_OUT = 0;
	/**
	 * 没币
	 */
	final static int NO_QUARTER = 1;
	/**
	 * 有币
	 */
	final static int HAS_QUARTER = 2;
	/**
	 * 可售出糖果
	 */
	final static int SOLD = 3;
 
	/**
	 * 跟踪机器的当前状态
	 * 
	 * 一开始被设置为“售罄”状态
	 */
	int state = SOLD_OUT;
	/**
	 * 机器内糖果的数目
	 */
	int count = 0;
  
	public GumballMachine(int count) {
		this.count = count;
		
		/*
		 * 如果糖果数量不为0，则机器进入“无币”的状态，即等待别人投币；
		 * 否则，保持在“售罄”状态
		 */
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
  
	/**
	 * 投币
	 */
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("不能重复投币！");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("投币成功！");
		} else if (state == SOLD_OUT) {
			System.out.println("对不起，糖果已售完！");
		} else if (state == SOLD) {
        	System.out.println("请稍等，我们正在售出糖果！");
		}
	}

	/**
	 * 退币
	 */
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("退币成功！");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("您还没投币呢，怎么退币？");
		} else if (state == SOLD) {
			System.out.println("对不起，糖果已售出不能退币！");
		} else if (state == SOLD_OUT) {
        	System.out.println("糖果已售完。停业！！！");
		}
	}
 
	/**
	 * 转动曲柄
	 */
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("正在出售糖果，稍安勿躁！");
		} else if (state == NO_QUARTER) {
			System.out.println("你还没投币呢！天下没有白吃的午餐！");
		} else if (state == SOLD_OUT) {
			System.out.println("糖果已售完，再怎么摇都没用。");
		} else if (state == HAS_QUARTER) {
			System.out.println("准备给您发放糖果...");
			state = SOLD;
			dispense();
		}
	}
 
	/**
	 * 发放糖果
	 */
	private void dispense() {
		System.out.println("正在发放糖果。。。");
		count = count - 1;
		if (count == 0) {
			System.out.println("啊！糖果买完了！！");
			state = SOLD_OUT;
		} else {
			state = NO_QUARTER;
		}
	}
 
	/**
	 * 重装糖果
	 * 
	 * @param numGumBalls
	 */
	public void refill(int numGumBalls) {
		this.count = numGumBalls;
		state = NO_QUARTER;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nyoungzy糖果公司");
		result.append("\n糖果数: " + count);
		result.append("\n糖果机的状态： ");
		if (state == SOLD_OUT) {
			result.append("售罄");
		} else if (state == NO_QUARTER) {
			result.append("无币");
		} else if (state == HAS_QUARTER) {
			result.append("有币");
		} else if (state == SOLD) {
			result.append("正在出售糖果");
		}
		result.append("\n");
		return result.toString();
	}
}
