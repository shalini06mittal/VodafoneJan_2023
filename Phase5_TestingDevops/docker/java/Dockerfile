FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
ENV SECRET SECRET_KEY
RUN javac HelloWorld.java
CMD ["java", "HelloWorld"]


# ADD HelloWorld.class HelloWorld.class
# ENTRYPOINT ["java", "HelloWorld"]




# RUN javac HelloWorld.java