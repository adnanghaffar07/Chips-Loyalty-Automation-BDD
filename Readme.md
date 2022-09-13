# Pharmaceutical Web Automation Testing
# Prerequisite 


  - JDK (v1.8) or Greater version [link](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) 
  - Maven (v3.8.1) or Greater version [link](https://maven.apache.org/download.cgi) 
  - Allure (v2.15.0) or Greater version   [link](https://github.com/allure-framework/allure2/releases?page=2)
  - Eclips (v4.22.0) [link](https://www.eclipse.org/downloads/)

# Setup
### Install the JDK, Maven, Allure and Eclips
##### JDK 
  - Download JDK (v1.8) or Greater version [link](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html)
  - Install JDK file 
  - Set environment variable for JDK bin folder and restart system
  - Verify JDK installation by running following command `java -version`
  
##### Maven 
  - Download  Maven (v3.8.1) or Greater version [link](https://maven.apache.org/download.cgi) 
  - Copy path to maven bin folder
  - Set environment variable for maven and restart system
  - To check the Maven version by running following command `mvn --version`
  
##### Allure 
  - Download  Allure (v2.15.0) or Greater version [link](https://github.com/allure-framework/allure2/releases?page=2)
  - Copy path to allure bin folder
  - Set environment variable for allure and restart system
  - To check the allure version by running following command `allure --version`
  
##### Eclips
  - Download Eclips (v4.22.0) [link](https://www.eclipse.org/downloads/)
  - Install Eclips

# Open project and run the tests
  - Open the project `Pharmaceutical` in Eclips
  - Go to the TestRunner class `TestRunner.java`. You can find it at the following path : `/PharmaCeutical/src/test/java/CucumberTest/TestRunner.java` 
  - Right click in the open file and select `Run As` > `JUnit Test`
  - The tests will start running.

# How to generate automation test reports
  - To Generate report Run Command `allure serve` in the project main directory.
  - After completing the job the report will automatically be shown in the default browser.
  
# How to view report received with email
  - Download and Extract the .zip file attacheched with the email.
  - Run command `allure serve` at the same directory level of 'allure-results' and you will see report in the browser after successfull generation.
