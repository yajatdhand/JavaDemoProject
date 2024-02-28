FROM openjdk:17
WORKDIR /app
COPY target/*.jar docker-integrate.jar
ENTRYPOINT ["java", "-jar", "docker-integrate.jar"]
