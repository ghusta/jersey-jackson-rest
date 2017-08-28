# Test Jersey - JAX-RS 2.0 - Jackson 2 on Tomcat 

## Prerequisites

- Tomcat 8.5
- Java 8

## Docker

### Build image

> docker build --tag ghusta/tomcat-jersey .

### Run image

> docker run -d --name rest-test -p8585:8080 ghusta/tomcat-jersey
