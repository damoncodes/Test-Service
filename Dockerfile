FROM openjdk:11.0
WORKDIR /app
COPY /target/Test-Service.jar /app/
EXPOSE 9090
CMD ["java", "-jar", "Test-Service.jar"]



