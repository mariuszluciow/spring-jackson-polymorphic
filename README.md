# Serialization and Deserialization of Polymorphic types in Spring Boot using Jackson

## Visitor pattern on JSON objects.

This simple app shows an example how serialize class with preserving its type, and then use this information to deserialize.
This example introduces interface `Animal` and two implementations: `Lion` and `Rat`. 

###Running application


To run this application simply start main method in `com.cohesiva.deserialize.Application` or invoke command line:
```bash
mvn clean install
java -jar target/deserialize-polymorphic-0.0.1-SNAPSHOT.jar
```
