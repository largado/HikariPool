FROM alpine:3.14
COPY . /usr/src/validaidm
WORKDIR /usr/src/validaidm/
RUN cd /usr/src/validaidm/
RUN ls
RUN chmod u+x mvnw
RUN apk add --no-cache openjdk11
RUN ./mvnw clean package
RUN cd /usr/src/validaidm/target
RUN ls
