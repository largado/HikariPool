FROM alpine:3.14
COPY . /usr/src/validaidm
WORKDIR /usr/src/validaidm
RUN mvn clean compile assembly:single
RUN java -jar TestaIdm.jar