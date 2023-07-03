public class HelloWorld {
    //docker run --name java_con --env SECRET=Hey hello_java
    // docker run --name <container_name> --env SECRET=Hey <imagename>
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.println("Env variable "+System.getenv("SECRET"));
    }
}