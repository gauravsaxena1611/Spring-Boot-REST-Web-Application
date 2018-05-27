-------------------------------------------------
(1) TESTING any WEB-APPLICATION using Spring BOOT
-------------------------------------------------
       UNIT Test --> When we want to test only one controller or service or any one class.
INTEGRATION Test --> When we want to test entire application and hence go across all the layers.

In this example we are creating INTEGRATION Test


We will be testing this service.
http://localhost:8080/surveys/{surveyId}/questions/{questionId}
http://localhost:8080/surveys/Survey1/questions/Question1


Below are the dependencies for the same

		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>


<scope>test</scope> make sure that these dependencies will not be available in production code.

------------------------------------------------
How to INITIALIZE and LAUNCH a  Web-Application
-------------------------------------------------
We have used folling configurations for this.
@RunWith(SpringRunner.class) --> Helps to launch a SPRING CONTEXT
@SpringBootTest(classes = SpringBootFirstWebApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
--> SpringBootTest helps in launching a spring boot application in a test.
@LocalServerPort  --> This helps in finding a available PORT and hence no chance for PORT clash



------------------------------
How to test a REST web-service
------------------------------

TestRestTemplate is the class which is used to invoke the rest web-service
HttpHeaders is used to pass the CONTENT NEGOTIATION --> ACCEPT (Application JSON)



@WebMvcTest is used to load only one class and not the entire application (Useful in unit testing)
@WebMvcTest will not do the component scan

Integration Test Classes
------------------------
SurveyControllerIT
SurveyControllerRefactoredIT


Unit Test Classes
------------------
SurveyControllerTest 



How unit test is coaded
-----------------------
1, Setup  (Where we mock the reat bean to something else --> Mokito.when.then **)
Mockito.when(****).thenReturn(****);

2, Invoke (when we call service on mocked Data --> api call)
@Autowired
private MockMvc mockMvc;
Use this in code
MvcResult result = mockMvc.perform(***).andReturn()


3, Verify  (when we do all --> Assert) 

