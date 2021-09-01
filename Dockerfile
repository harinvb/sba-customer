FROM openjdk:11
COPY target/*.jar Application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/Application.jar"]