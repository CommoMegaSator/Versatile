FROM openjdk:17-alpine
MAINTAINER CommoMegaSator
VOLUME /tmp
EXPOSE 3000
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/versatile-shop.jar /app/versatile-shop.jar
ENTRYPOINT ["java", "-jar", "/app/versatile-shop.jar"]