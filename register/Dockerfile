FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

# ARG JAR_FILE=target/agendamento-0.0.1-SNAPSHOT.jar
# ADD ${JAR_FILE} app.jar

WORKDIR /opt/spring_boot

COPY /register/target/register-0.0.1-SNAPSHOT*.jar register-0.0.1-SNAPSHOT.jar

SHELL ["/bin/sh", "-c"]
ENTRYPOINT ["java", "-jar", "register-0.0.1-SNAPSHOT.jar"]

EXPOSE 5007
EXPOSE 8082

CMD java ${ADDITIONAL_OPTS} -jar register-0.0.1-SNAPSHOT.jar --spring.profiles.active=${PROFILE}