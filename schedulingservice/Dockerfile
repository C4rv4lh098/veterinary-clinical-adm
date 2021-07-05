FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
# EXPOSE 8080
# ARG JAR_FILE=./.mvn/wrapper/maven-wrapper.jar
# COPY ${JAR_FILE} ./.mvn/wrapper/maven-wrapper.jar
# ENTRYPOINT ["java","-jar","./.mvn/wrapper/maven-wrapper.jar"]

# From openjdk:8
# copy ./target/employee-jdbc-0.0.1-SNAPSHOT.jar employee-jdbc-0.0.1-SNAPSHOT.jar
# CMD ["java","-jar","employee-jdbc-0.0.1-SNAPSHOT.jar"]
