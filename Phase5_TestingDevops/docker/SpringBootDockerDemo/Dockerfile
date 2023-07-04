#FROM openjdk:11
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo/test","-jar","/app.jar"]

FROM openjdk:11
EXPOSE 8081
WORKDIR /app

# Copy maven executable to the image
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file
COPY pom.xml .

# Copy the project source
COPY ./src ./src
COPY ./pom.xml ./pom.xml

RUN chmod 755 /app/mvnw

RUN ./mvnw clean package -DskipTests


ENTRYPOINT ["java","-jar","target/spring-mongo.jar"]


#ENTRYPOINT ["java","-jar","/app.jar"]