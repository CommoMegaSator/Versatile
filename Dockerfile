FROM openjdk:17-alpine
MAINTAINER CommoMegaSator
VOLUME /tmp
EXPOSE 5000
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/versatile.jar /app/versatile.jar
ENTRYPOINT ["java", "-jar", "/app/versatile.jar"]