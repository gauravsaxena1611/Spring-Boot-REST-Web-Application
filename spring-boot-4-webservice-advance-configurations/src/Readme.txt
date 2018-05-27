----------------------------
(1) CONFIGURING APPLICATION
----------------------------

Different ways of READING CONFIGURATION PROPERTIES
--------------------------------------------------
https://github.com/gauravsaxena1611/SpringBootForBeginners/blob/master/Step15.md
1, From application.properties --> Least in priority, Below welcome service is implemented via this.
2, Program Arguments --> 
We can also pass properties via command line arguments E.G. -- > (--welcome.message="SomethingElse").
This have the higher priority then application.properties, if both is given then Program Arguments will take effect.
3,Configure all properties from one file at some location -->
We can give that folder location in command line arguments E.G. -- > (--spring.config.location=classpath:/default.properties).


Web-Services
--------------------

---------------------
(GET Request Example )
----------------------
1, http://localhost:8080/welcome
In this we have printed message from property file.





-----------------------------------
(2) DYNAMIC CONFIGURATION MANAGMENT
-----------------------------------
https://github.com/gauravsaxena1611/SpringBootForBeginners/blob/master/Step17.md

What is a property is assigned a value which is not of that type (20 assigned to a BOOLEAN property)
What if we have to used multiple 20 properties, will we have to use 20 @Value at multiple places?
What if there are many properties usage in the application? cant we have a single place to find it out?

In this cases we use CONFIGURATION BEAN,
we create normal bean with all properties and those properties are mapped to a properties file and later we can use then in code at any place.

We have created (ConfigurationBean) for this purpose
and we are using this bean in application.properties via (FromConfigBean.isTrue: true, FromConfigBean.message: Dynamic Message, FromConfigBean.number: 100)

Then we have used it in WelcomeController via url mapping for  ("/welcomeConfiguration")
Test it  --> http://localhost:8080/welcomeConfiguration 
you will get below response from properties file using ConfigurationBean
{"number":100,"flag":false,"message":"Dynamic Message"}


CONFIGURATION BEAN are type safe
---------------------------------
if you assign FromConfigBean.isTrue: to 20 then at start up application will throw an error.
So in this way we can never give wrong value to any property. HENCE THIS IS TYPE SAFE





------------------------
(3) PROFILING IN SPRING
------------------------
https://github.com/gauravsaxena1611/SpringBootForBeginners/blob/master/Step16.md
Profiles are used in spring to do some specific task differently in different environments
they can be used for
1, Load different properties files based on environments.
2, Enable/Disable creation of beans based on environments.



Profiles can be set from 2 ways
--------------------------------
1, Using application.properties properties file.
In this way we will allow spring to choose a specified profile properties file (In this example its --> application-prod.properties)
and give preference to PROD properties over normal application.properties. 
Rest properties will be taken from  normal application.properties.


Now if while executing the application, in application.properties if we change (spring.profiles.active) to DEV/TEST etc then application-prod.properties will not take effect
and if we change it to PROD, then application-prod.properties will take effect.

2, Using command line arguments
in commant line arguments we can pass this as an argument --> -Dspring.profiles.active=PROD.
This will have the same effect as above.



How to Enable/Disable creation of beans based on environments using profiling
------------------------------------------------------------------------------
using @Profile("dev") on a bean
This can be used for testing application with some default/mock values.

And you can check whcih bean is created by using Spring Boot Actuator
using --> http://localhost:8080/beans



