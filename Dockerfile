#Build a Jar file
#FROM maven:3.6.3-jdk-11-slim AS stage1
#WORKDIR /home/app
#COPY . /home/app/
#RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:12-jdk-alpine

COPY ./target/*.jar hello-world-java.jar
ENTRYPOINT ["java","-jar", "/hello-world-java.jar"]