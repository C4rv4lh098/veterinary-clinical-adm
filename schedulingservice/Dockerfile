# FROM openjdk:8
# ADD schedulingservice.jar app.jar
# RUN bash -c 'touch /app.jar'
# ENTRYPOINT  ["java" "-jar" "app.jar"]
# USER spring:spring

# EXPOSE 8080
# ARG JAR_FILE=./.mvn/wrapper/maven-wrapper.jar
# COPY ${JAR_FILE} ./.mvn/wrapper/maven-wrapper.jar
# ENTRYPOINT ["java","-jar","./.mvn/wrapper/maven-wrapper.jar"]

# From openjdk:8
# copy ./target/employee-jdbc-0.0.1-SNAPSHOT.jar employee-jdbc-0.0.1-SNAPSHOT.jar
# CMD ["java","-jar","employee-jdbc-0.0.1-SNAPSHOT.jar"]

FROM openjdk:8

ARG PROFILE
ARG ADITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADITIONAL_OPTS=${ADITIONAL_OPTS}

WORKDIR /opt/spring_boot

COPY /target/schedulingservice-0.0.1-SNAPSHOT*.jar schedulingservice-0.0.1-SNAPSHOT.jar

SHELL ["*/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8080

CMD java${ADITIONAL_OPTS} -jar schedulingservice-0.0.1-SNAPSHOT.jar --spring.profiles.active=${PROFILE}