FROM openjdk:8u151-jre-slim

EXPOSE 9001

COPY ./target/reacciones.jar /usr/src/reacciones.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "reacciones.jar"]