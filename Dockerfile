FROM openjdk:17.0.2
VOLUME /tmp
EXPOSE 9999
ARG JAR_FILE=target/SpringBootDemoProject-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
