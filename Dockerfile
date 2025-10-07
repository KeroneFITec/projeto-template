FROM openjdk:17.0.2-slim
WORKDIR /app
COPY target/[APPLICATION]-[VERSION].jar .
ENTRYPOINT ["java", "-jar", "/app/app.jar"]