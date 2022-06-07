FROM openjdk:8u151-jre-slim

EXPOSE 8761

COPY ./target/eurekaserver.jar /usr/src/eurekaserver.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "eurekaserver.jar"]