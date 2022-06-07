FROM openjdk:8u151-jre-slim

EXPOSE 9000

COPY ./target/comentarios.jar /usr/src/comentarios.jar

WORKDIR /usr/src

CMD ["java", "-jar" , "comentarios.jar"]