1 log4j2搭建过程（每一个模块下面都放）
（1）pom.xml依赖
（2）resource下放log4j2.xml与log4j2.component.properties文件

2 sleuth搭建过程
（1）pom.xml依赖
（2）log4j2.xml文件更新，内容如下：
	<PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %-5level [%logger{50}:%L] [%X{X-B3-TraceId},%X{X-B3-SpanId}] - %msg%n" charset="UTF-8"/>
	原本是没有[%X{X-B3-TraceId},%X{X-B3-SpanId}] ，添加之

3 zipkin搭建过程（只需要：微服务、网关，eureka服务不需要！）
（1）pom.xml依赖
（2）application.properties配置
	spring.sleuth.sampler.percentage=1
	spring.zipkin.baseUrl=http://localhost:9411
  localhost:9411，打开这个网址，会有监控页面出现

（3）zipkin官方运行jar地址（C:\Program Files）
	https://dl.bintray.com/openzipkin/maven/io/zipkin/java/zipkin-server/2.12.9/
（4）参考博客
	https://www.jianshu.com/p/f177a5e2917f

4 日志收集
前言：zipkin默认是内存收集日志，一旦zipkin重启，那么之前的数据就丢失了，因此需要将分布在各个服务器上的日志收据收集保存起来

工具下载地址：https://www.elastic.co/downloads
需要下载三个：Elasticsearch、Kibana、Logstash【C:\Program Files】
Elasticsearch启动[localhost:9200]：cmd进入目录C:\Program Files\elasticsearch-7.8.1\bin，输入：elasticsearch.bat即可

5 zipkin + elasticsearch 联合启动
5.1 进入zipkin目录
5.2 启动elasticsearch
5.3 cmd运行以下指令
java -jar zipkin.jar --STORAGE_TYPE=elasticsearch --DES_HOSTS=http://localhost:9200

6 ELK联合运用
具体查看项目中的ELK.docx文件。
这里由于zipkin存入elasticsearch需要另外的依赖jar，放弃这个方案，采用ELK通用方案！
