# springboot-dubbo-zookeeper
### 1.说明
此项目中有三个独立的项目，api,server,client.
### api:
此项目主要是用于存放server，client公用的东西，比如实体类，服务接口等，需要独立启动。
### server:
此项目用来实现api项目中对外暴露的服务接口，需要独立启动。
### client
此项目，我们用来调用对外暴露的接口。

### 2.运行步骤：
#### 1.下载项目到本地
ssh方式：

git clone git@github.com:lightClouds917/springboot-dubbo-zookeeper.git

https方式：

git clone https://github.com/lightClouds917/springboot-dubbo-zookeeper.git

#### 2.启动
外层的springboot-dubbo-zookeeper 只是用来包装三个子项目的，无实际意义；

修改zookeeper的地址；

然后依次启动api,server,client；

然后直接访问client中的接口即可。

springboot-dubbo-zookeeper教程可参考：https://blog.csdn.net/weixin_39800144/article/details/80632527

dubbo原理和架构可参考：https://blog.csdn.net/weixin_39800144/article/details/80578393