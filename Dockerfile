FROM eclipse-temurin:17
COPY target/consumer.jar consumer.jar
CMD [ "java","-jar","consumer.jar" ]