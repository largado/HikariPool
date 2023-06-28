FROM alpine:3.14
COPY . /usr/src/validaidm
WORKDIR /usr/src/validaidm/src
RUN cd /usr/src/validaidm/src
RUN ls
RUN mvnw clean compile assembly:single
RUN java -jar TestaIdm.jar