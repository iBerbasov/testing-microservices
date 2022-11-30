FROM openjdk:17-jdk-slim
ADD ./target/configserver-1.jar config.jar
ENTRYPOINT ["java", "-jar", "config.jar"]