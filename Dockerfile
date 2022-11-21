FROM openjdk:11-jre-slim
FROM jenkins
ARG JAR_FILE=build/libs/docker-demo-1.0.0.jar

# cd /opt/app
WORKDIR /opt/app

EXPOSE 8080

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]