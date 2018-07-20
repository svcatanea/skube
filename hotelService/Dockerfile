FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/hotelService.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 6100
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]