Build status on Travis CI  
[![Build Status](https://travis-ci.org/jeffxor/spring-social-intuit.png?branch=master)](https://travis-ci.org/jeffxor/spring-social-intuit)
## Spring Social Support ##
Please note that the master branch is now supporting version 1.1.X of the Spring Social Project. If you need support 
for version 1.0.X this is available on the 2.0.X branch.

spring-social-intuit-2.0.X = spring-social-core-1.0.X
spring-social-intuit-2.1.X = spring-social-core-1.1.X

## Spring Social Intuit ##
This is an intial start for a Spring Social Connection to Intuit Quickbooks
using there Intuit Partner Platform Data Service for QuickBooks Online. This service
support OAuth version 1 and has been modeled off the Twitter integration provided by
spring.

You can find further documentation of Intuit's QuickBooks Online API at
https://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0050_Data_Services/0400_QuickBooks_Online

Currently supported objects are:-
* Account
* CompanyMetaData
* Customer
* Invoice
* Item
* Payment
* PaymentMethod

To check out the project and build from source, do the following:

` git clone --recursive git://github.com/jeffxor/spring-social-intuit.git  
 cd spring-social-intuit  
 ./gradlew build  
`
===============================================================================
