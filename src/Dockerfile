FROM openjdk:18
COPY . /usr/src/validaidm
WORKDIR /usr/src/validaidm
CMD ["mvn", "clean", "compile", "assembly:single"]
CMD ["java", "-jar", "TestaIdm.jar"]