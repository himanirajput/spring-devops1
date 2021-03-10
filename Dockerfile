FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/spring-devops-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} spring-devops.jar
ENTRYPOINT ["java","-jar","/spring-devops.jar"]