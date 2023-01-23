1 Build the application:
```
mvn clean install
```

2 Run the application:
```
mvn spring-boot:run
```
3 Adding security dependency to pom.xml

3 Test the application using curl:
```
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=6B7740379C04F219D4FD3935DA281DFE' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bacterial"
}'
```

4 Writing Integration Test

5 Writing Exceptions for each parameter

