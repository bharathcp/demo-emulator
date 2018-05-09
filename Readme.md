# Demo emulator using springboot
This is a demo emulator using spring. It uses the `demo-harness` project as a module to add tests to the emulator. This way the emulator always gets built passing the tests for the real service.

The emulator uses a yaml node - `mock.data` as datasource or users to service requests.

## Usecase
As a goat, I want to be able to get my IR number just by giving my personal details.

##Run the harness locally
`sh gradlew bootrun` 

##Build
`sh gradlew build`
The distribution package is generated in `/Users/prakashb/Documents/assuritybitbucket/demo-harness/build/libs/`

##Running distribution package
```
java -jar demo-emulator-1.0-SNAPSHOT.jar
```

##Accessing the application
Application is available on port `8080`. In local you can access the `POST` endpoint `http://localhost:8080/ir_number`. 

###Documentation
The interactive documentation of all the endpoints are available on `http://localhost:8080/swagger-ui.html`.

###Data endpoint
This gives all the mock data loaded into the emulator that can be used for testing - `GET http://localhost:8080/data`

### Health endpoint
This can be used for monitoring if the application is healthy and serving - `GET http://localhost:8080/health`

### Info endpoint
Gives the information of the version and commit of the emulator - `GET http://localhost:8080/info`
