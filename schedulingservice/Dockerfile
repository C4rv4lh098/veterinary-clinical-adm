FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

# ARG JAR_FILE=target/agendamento-0.0.1-SNAPSHOT.jar
# ADD ${JAR_FILE} app.jar

WORKDIR /opt/spring_boot

# RUN apt-get install mvn

# RUN mvn clean install

COPY /schedulingservice/target/schedulingservice-0.0.1-SNAPSHOT*.jar schedulingservice-0.0.1-SNAPSHOT.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5006
EXPOSE 8081

CMD java ${ADDITIONAL_OPTS} -jar schedulingservice-0.0.1-SNAPSHOT.jar --spring.profiles.active=${PROFILE}