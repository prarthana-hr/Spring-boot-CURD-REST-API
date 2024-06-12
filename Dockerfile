FROM openjdk:17
ADD target/NewDemo-0.0.1-SNAPSHOT.jar Docker-1.jar
ENTRYPOINT ["java","-jar","Docker-1.jar"]