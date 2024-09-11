#an official Java runtime as a parent image
FROM openjdk:17-jdk-slim
# Set the working directory
WORKDIR /app
# Copy the jar file into the container
COPY target/event-management-0.0.1-SNAPSHOT.jar app.jar
# Expose the port the app runs on
EXPOSE 8080
# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]