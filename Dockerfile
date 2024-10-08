FROM openjdk:17

COPY build/*.jar app-devops.jar

EXPOSE 80
CMD ["java", "-jar", "app-devops.jar", "--server.port=80"]