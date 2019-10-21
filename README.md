# Test Jersey - JAX-RS 2.1 - Jackson 2 on Tomcat 

## Docker

### Build image

> docker build --tag ghusta/tomcat-jersey .

### Run image

> docker run -d --name rest-test -p 8585:8080 ghusta/tomcat-jersey

## Notes

* JAX-RS 2.1 support in [Jersey](https://eclipse-ee4j.github.io/jersey/) since v2.26.