FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY . .
RUN ./mvnw clean package
CMD ["java", "-jar", "target/demo-app-1.0-SNAPSHOT.jar"]
