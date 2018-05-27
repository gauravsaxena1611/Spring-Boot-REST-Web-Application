If we have to version same URL for different use then we use versioning.

URL IS SAME,  but we can identify the difference based on some IDENTIFIERS.

In this example we have used multiple approaches

Approach to Identify Versions of WEB-SERVICES
----------------------------------------------
For all these approaches refer (PersonVersioningController)
-----------------------------------------------------------
(URI Versioning) APPROACH 1) 
make URL different


(REQUEST Param Versioning) APPROACH 2) 
Based on URL PARAMS
Pass in GET request


(HEADER Param Versioning) APPROACH 3) 
Based on HEADER PARAMS
Passed in HEADER

in Header pass 
X-API-VERSION : 1 OR 2

(ACCEPT HEADER VERSIONING / MIME type Versioning) APPROACH 4) 
Based on PRODUCES --> this is also a HEADER PARAMS but the way in which it is send is different
Passed in HEADER but different from HEADER PARAMS

in Header pass 
ACCEPTS : application/vnd.company.app-v1+json OR application/vnd.company.app-v2+json

