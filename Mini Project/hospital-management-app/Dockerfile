FROM  openjdk
VOLUME /tmp
ARG JAR_FILE
COPY $(JAR_FILE) app.jar
ENTRYPOINT ["java","_Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]