## Reason
I could not find a simple easy and most importantly *correct* way of setting up Resteasy and Spring in a Tomcat 8 container.
Most examples are very very old and others were just plain wrong. There was even one that setup Spring and then did a 
````new ResourceImpl()````

## run this example
. Build it
  ````
  mvn clean install
  ````
. install it in a tomcat server
. go to ````http://localhost:8080/dev/api/simple```` and ````http://localhost:8080/dev/api/simple/spring````
