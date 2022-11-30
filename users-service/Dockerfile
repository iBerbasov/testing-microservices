FROM openjdk:17-jdk-slim
ADD ./target/users-service-1.jar users.jar
ENTRYPOINT ["java", "-jar", "users.jar"]