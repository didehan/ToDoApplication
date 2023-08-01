FROM openjdk:17
EXPOSE 8080
ARG JAR_FILE=gradle/wrapper/gradle-wrapper.jar
ADD ${JAR_FILE} todoApp.jar
ENTRYPOINT ["java", "-jar","/todoApp.jar"]
