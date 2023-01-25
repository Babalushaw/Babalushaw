#Use the openJDK 11 image as the the base image
FROM openjdk:11

#Create a new app directory for my application file
RUN mkdir /app

# Copy the app files from host machine to image filesystem
COPY src/main/java/com.example.demo/ /app

# Set the directory for executing future commands
WORKDIR /app

#RUN The main class
CMD java DemoApplication