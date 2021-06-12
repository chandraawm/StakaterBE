# StakaterBE Service Notes

This service is used to display "Hello $Name" 

This is simple springboot Microservice and serve as RESTAPI. It can be called from FrontEnd Service .

It just reads the content/name from environment variable $Name and provides the response as Hello $Name

Technologies Used : Java , Spring Boot and Rest API(micro service)

Deployment : openshift used

Deployment Notes : 

1. Port Used : 8081 . configured in application.yml

2. Should configure environment variable Name with value to up and running this service.

3. Sample url : http://localhost:8081/displayHello (displayHello is the Rest URI path)

4. Sample OUTPUT of the service is ::  Hello Chandra Reddy (Here env variable Name set to Chandra Reddy)