FROM openjdk:8u151-jre-slim

EXPOSE 9002

COPY ./target/publicacion.jar /usr/src/publicacion.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "publicacion.jar"]