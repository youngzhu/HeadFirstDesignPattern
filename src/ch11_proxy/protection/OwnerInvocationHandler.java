package ch11_proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 本人调用
 * @author by Yang.ZHU
 *	on 2017-1-25
 *
 * 
 * Package&FileName: ch11_proxy.protection.OwnerInvocationHandler
 */
public class OwnerInvocationHandler implements InvocationHandler {

	PersonBean person;
	 
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
 
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
  
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(person, args);
   			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException("不能给自己评分！");
			} else if (method.getName().startsWith("set")) {
				return method.invoke(person, args);
			} 
        } catch (Exception e) {
            e.printStackTrace();
        } 
		return null;
	}

}
