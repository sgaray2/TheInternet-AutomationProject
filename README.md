# The Internet - Automation Project

## Introduction
The internet: https://the-internet.herokuapp.com/
is a website that enables different features to automate, with the goal to exercise Automation 
knowledge. Some of the features are login, dropdowns, file upload, javaScript alerts, etc.

The test case automated are the following:
I have my automated test cases for the login form feature. 3 test cases were added:
1) successAuthentication: verifies a succesful login for a given username and password.
2) FailedAuthentication: verifies the error message for an incorrect username and password.
3) IncorrectPassword: verifies the error message for a correct username but incorrect password.

UPDATE: I added 2 test cases for the nested frames feature.
1) verifyLeftFrame: verifies the message located inside the left frame.
2) verifyRightFrame: verifies the message located inside the right frame.

UPDATE 18/09: I added 5 test cases for horizontal slider and upload files features:
* Horizontal Slider
1) verifyFifthValue: clicks the slider until the fifth value is shown.
2) verifySecondValue: clicks the slider until the second value is shown.
3) verifyFourthValue: clicks the slider until the fourth value is shown.

* Upload files
1) uploadPDFFile: verify a pdf file upload and checks if it was uploaded succesfully and if it is the correct file.

#### *IDE:
Eclipse.

#### *Test automation framework:
Selenium.

#### *Selenium tool:
Selenium WebDriver.

#### *Programming language:
Java.

#### *Framework:
Created a project Using Maven for build, execution, and dependency purpose. 
I defined a standardized maven project: 

* src/test/java: Authentication package where there is one class that has 3 different scenarios for the login feature.
* src/main/java: in this package is stored everything related to my framework needed to give support to my automated test cases.
1) Pages: implemented page object model pattern to separate element locators from the test cases, every page has its own class with
the elements needed to interact with and the methods to give behavior to that elements. 
2) resources: I have the base class with all the configurations needed for my driver, implicit wait, which browser to execute the
test cases, method to take screenshots.
-Created a screenshot folder to store the screenshots for the test cases with status equal to failed.
3) configurations: the properties file is inside this package, this file contains some data to use in my test cases, browser, environment
url.

#### *Testing Framework:
Using TestNG for Assertions, Grouping, and Parallel execution.
-Created testng.xml file which for now it runs the AuthenticationForm class that has 3 test cases and also the test cases
that belongs to NestedFramesTests.
-Annotations used: 
* BeforeMethod and AfterMethod: both to open and close the browser after every test.
* Test: for every test case.

#### *Version Control:
GIT.