FROM openjdk:23-jdk-slim

WORKDIR /app

EXPOSE 8000

COPY . .

CMD ["tail", "-f", "/dev/null"]