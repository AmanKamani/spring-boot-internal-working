package org.example.helloserviceautoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.example") 
// To scan the HelloService class. Because that is not in the same package.
// And also ComponentScan, ensures that HelloService is being added to the classpath & then autoconfiguration will pickup from there
public class HelloServiceAutoConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceAutoConfigurationApplication.class, args);
    }
}
