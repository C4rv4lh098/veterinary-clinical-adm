FROM openjdk:8-jdk-alpine
COPY ./schedulingservice/.mvn/maven-wrapper.jar maven-wrapper.jar
# CMD ["java","-jar","maven-wrapper.jar"]
ENTRYPOINT ["java","-jar","/maven-wrapper.jar"]