# 如何测试

1. 设置`CLASSPATH`路径
	将项目的编译路径（bin 目录）设置到`CLASSPATH`路径里。
	可用以下命令验证：
	
	```
	# Linux/Unix
	echo $CLASSPATH
	
	# Windows
	echo %CLASSPATH%
	```
	
2. 启动 RMI 注册服务

	```
	# Linux/Unix
	rmiregistry &
	
	# Windows
	start rmiregistry
	```
	
3. 启代理服务

	```
	java ch11_proxy.remote.GumballMachineTestDrive localhost 120
	```
	
	**注意**
	1. 执行命令前，确保当前目录是在 bin
	2. 注意对应自己的包（package）名
	3. 第一个参数必须是 **localhost** ，因为是你本地启的RMI注册服务（见 第 2 步）
	
4. 启客户端

	```
	java ch11_proxy.remote.GumballMonitorTestDrive localhost
	```
	
	> 跟第 3 步一样，注意执行路径、包名以及参数（只能是 **localhost**）