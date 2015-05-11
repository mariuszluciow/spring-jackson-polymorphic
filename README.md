# Serialization and Deserialization of Polymorphic types in Spring Boot using Jackson

## Visitor pattern on JSON objects.

This simple app shows an example how serialize class with preserving its type, and then use this information to deserialize.
This example introduces interface `Animal` and two implementations: `Lion` and `Rat`. 

### Running application

To run this application simply start main method in `com.cohesiva.deserialize.Application` or invoke command line:
```bash
mvn clean install
java -jar target/deserialize-polymorphic-0.0.1-SNAPSHOT.jar
```

### Testing serialization
This application serves few rest endpoinds. To fetch whole zoo invoke:
```bash
curl -s http://localhost:8080/zoo
```
As you can see in response each animal object contains property **@class**, which contains java class name.
```json
{
    "animals": [
        {
            "@class": "com.cohesiva.deserialize.web.model.Lion",
            "name": "Gerard, King of the Jungle",
            "lionessNo": 2
        },
        {
            "@class": "com.cohesiva.deserialize.web.model.Rat",
            "name": "Boghdan, One of many"
        }
    ]
}
```
This behaviour is enabled because `Animal` class is annotated:
```java
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
```

### Testing deserialization
Hit this url with post to add new animal to zoo.
```bash
 curl -s -H "Content-Type: application/json" -X POST -d '{"name": "Tom", "lionessNo": 5, "@class": "com.cohesiva.deserialize.web.model.Lion"}' http://localhost:8080/animals
```
This invokes visitor service `ZooService`, and prints on console:
```
Locking lion Tom, King of the Jungle with 5 lioness
```
### Gotcha 

It's not all so pretty. Hit this endpoint:
```bash
curl -s http://localhost:8080/animals
```
Class information is missing due to java type erasure. To see more about this behaviour see [this issue](https://github.com/FasterXML/jackson-databind/issues/336).
