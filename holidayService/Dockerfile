FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/holidayService.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 6200
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]