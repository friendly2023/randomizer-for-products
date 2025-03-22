FROM openjdk:21-jdk-slim
WORKDIR /app
COPY build/libs/randomizer-for-products-1.0-SNAPSHOT.jar app.jar
COPY .env .env
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
