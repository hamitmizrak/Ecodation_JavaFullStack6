FROM maven:3-jdk-8-slim
COPY . /app/
WORKDIR /app/
ENTRYPOINT \
mkdir deneme55 \
    ./mvnw clean package -Dskipstest \
