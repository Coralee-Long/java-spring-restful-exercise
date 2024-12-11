package exercise.hh_java_24_5_spring_exercise;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    // Step 1: Create a Spring Boot application using the Spring Initializr and add the spring-web-starter.

    // Step 2: Write a controller that handles a GET request to '/api/hello' and returns 'Hello, World!'.

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World 🌈";
    }

//    Step 3: Use path variables to customize the name in the message.
//    Example: '/api/hello/John' returns 'Hello, John!'.
    @GetMapping("/hello/{name}")
    public String sayHelloWithName(@PathVariable String name) {
        return "Hello " + name + "!"; // Hello Jane!
    }

}
