in User Bean we have three things as below
private Integer id;
private String name;
private Date birthDate;

If in response we don't want to send birthDate then this is done by FILTERING.

I.E. if we want to restrict some fields to be send in response then FILTERING is used.

STATIC FILTERING work all the time in just one one I.E. some field(s) will mot be available for all the requests.
DYNAMIC FILTERING  can work differently for every different request.


TO implement DYNAMIC FILTERING  we have created (SomeBean) bean and used it in (FilteringController).
now /filtering       will not show --> ("field3")
and /filtering-list  will not show --> ("field1") in entire array


How we have implemented --> FILTERING
--------------------------------------
STATIC FILTERING (Filtering --> ON BEAN)
----------------------------------------
APPLOACH 1)
----------
Use @JsonIgnore above the FIELD and that field will be IGNORED for RESPONSE.

APPLOACH 2)
----------
@JsonIgnoreProperties(value={"name","birthDate"}) --> this example is from User bean.
All the specified field will be IGNORED for RESPONSE.


DYNAMIC FILTERING (Filtering --> Where we are retreving these values)
---------------------------------------------------------------------
STEP 1) annote CLASS with --> @JsonFilter("SomeBeanFilter") for e.g. in SomeBean class.
STEP 2) Handle code in controller or any other class. like in (FilteringController)





TESTING
-------
1) URL: http://localhost:8080/filtering
   RESULT --> {"field1":"value1","field2":"value2"} --> field3 skipped

2) URL:http://localhost:8080/filtering-list
   [{"field2":"value2","field3":"value3"},{"field2":"value22","field3":"value32"}]  --> filed1 skipped





Previous Project
----------------
spring-boot-rest-webservices-4-validations


URLS
----
Same as spring-boot-rest-webservices-1-helloworld project.
Please refer the Readme doc.

