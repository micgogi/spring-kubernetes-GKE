  
FROM java:8-jre
WORKDIR usr/src
ADD ./target/kuber1-0.0.1-SNAPSHOT.jar /usr/src/kuber1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","kuber1-0.0.1-SNAPSHOT.jar"]