package ch11_proxy.protection;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class ProtectionProxyTestDrive {

	HashMap<String, PersonBean> datingDB = new HashMap<String, PersonBean>();
 	
	public static void main(String[] args) {
		ProtectionProxyTestDrive test = new ProtectionProxyTestDrive();
		test.drive();
	}
 
	public ProtectionProxyTestDrive() {
		initializeDatabase();
	}

	public void drive() {
		System.out.println("++++++++++++本人操作+++++++++++++++++");
		PersonBean zhangsan = getPersonFromDatabase("张三"); 
		PersonBean ownerProxy = getOwnerProxy(zhangsan);
		System.out.println("姓名： " + ownerProxy.getName());
		ownerProxy.setInterests("太极");
		System.out.println("兴趣已被修改！");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("评分： " + ownerProxy.getHotOrNotRating());
		System.out.println("被评次数：" + ownerProxy.getRatingCount());

		System.out.println("============他人操作============");
		PersonBean nonOwnerProxy = getNonOwnerProxy(zhangsan);
		System.out.println("姓名： " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("泡妞");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("评分已被修改！");
		System.out.println("评分：" + nonOwnerProxy.getHotOrNotRating());
		System.out.println("被评次数：" + ownerProxy.getRatingCount());
	}

	PersonBean getOwnerProxy(PersonBean person) {
 		
        return (PersonBean) Proxy.newProxyInstance( 
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
	}

	PersonBean getNonOwnerProxy(PersonBean person) {
		
        return (PersonBean) Proxy.newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
	}

	PersonBean getPersonFromDatabase(String name) {
		return (PersonBean)datingDB.get(name);
	}

	void initializeDatabase() {
		PersonBean zhangsan = new PersonBeanImpl();
		zhangsan.setName("张三");
		zhangsan.setInterests("汽车, 电脑, 音乐");
		zhangsan.setHotOrNotRating(7);
		datingDB.put(zhangsan.getName(), zhangsan);

		PersonBean xiaohong = new PersonBeanImpl();
		xiaohong.setName("小红");
		xiaohong.setInterests("网购, 逛街, 看电影");
		xiaohong.setHotOrNotRating(6);
		datingDB.put(xiaohong.getName(), xiaohong);
	}
}
