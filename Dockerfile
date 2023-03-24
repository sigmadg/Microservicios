FROM openjdk:7-jdk

EXPOSE 8080

COPY . /app
WORKDIR /app

RUN gradle clean build

CMD ["gradle", "bootRun"]
