FROM openjdk:8

ADD feign_demo_server-0.0.1-SNAPSHOT.jar /opt/app/app.jar
RUN bash -c 'touch /opt/app/app.jar'

# 开放8080端口
EXPOSE 8080

ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# 配置容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/app/app.jar"]