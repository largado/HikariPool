FROM alpine:3.14
COPY . /usr/src/validaidm
WORKDIR /usr/src/validaidm/
RUN cd /usr/src/validaidm/
RUN ls
RUN chmod u+x mvnw
RUN mvnw clean compile assembly:single
RUN java -jar TestaIdm.jar