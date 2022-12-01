FROM openjdk:17-jdk-slim
ADD ./target/statistics-service-0.0.1-SNAPSHOT.jar stat.jar
ENTRYPOINT ["java", "-jar", "stat.jar"]