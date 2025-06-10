FROM openjdk:11

EXPOSE 8080

COPY . . 

RUN /bin/bash -c "/mvnw clean package"

ENTRYPOINT [ "java", "-jar", "livraria-1.0.0.jar" ]
