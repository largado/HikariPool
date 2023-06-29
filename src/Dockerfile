FROM alpine:3.14
COPY . /usr/src/validaidm
WORKDIR /usr/src/validaidm/
RUN cd /usr/src/validaidm/
RUN ls
RUN chmod u+x mvnw
RUN apk add --no-cache openjdk11
RUN ./mvnw clean package
RUN ls
RUN ls /usr/src/validaidm/out/articacts/spring_data_jar
RUN java -jar /usr/src/validaidm/out/articacts/spring_data_jar/spring-data.jar
