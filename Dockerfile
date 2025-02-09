FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} productservice.jar
ENTRYPOINT ["java","-jar","/productservice.jar"]
