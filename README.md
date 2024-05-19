# Spring Boot Internal Working

The below 3 apps. describes the custom spring boot starter & How it works

## 1. hello-service
This is a normal java library, containing a service file. Which will be used in our main application `hello-service-auto-configuration`.

### Setup
1. Install dependency `mvn clean compile`
2. Publish to Local `mvn install`


## 2. hello-starter
This is a custom spring boot starter. Which provides the instance of `hello-service`, if it is not found in the application context. It creates the instance by reading few properties from `application.properties` or `application.yml` file.

Also, added `spring-boot-configuration-processor`, so that custom configuration properties will be suggested by the IDE while writing into the `application.properties` or `application.yml` file. Check the pom.xml file to know, how IDE detects the config. properties.

Added the configuration properties validation by using `spring-boot-starter-validation` (hello service prefix validation) & using `SpringBootCondition` (hello service suffix validation).

### Setup
1. Install dependency `./mvnw clean compile`
2. Publish to Local `./mvnw install`