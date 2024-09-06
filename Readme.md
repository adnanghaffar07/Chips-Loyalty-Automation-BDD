# Web Automation Testing
# Prerequisite 
  - JDK (v1.8) or Greater version [link](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) 
  - Maven (v3.8.1) or Greater version [link](https://maven.apache.org/download.cgi) 
  - Allure (v2.15.0) or Greater version   [link](https://github.com/allure-framework/allure2/releases/download/2.15.0/allure-2.15.0.zip)
  - Eclips (v4.22.0) [link](https://www.eclipse.org/downloads/)

# Setup
### Install the JDK, Maven, Allure and Eclips
#### JDK 
  - Download JDK (v1.8) or Greater version [link](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html)
  - Install the JDk 
  - Right click from the mouse on the JDK application and select the option `Run as administrator`
  - Open settings and type `environment` and set the Environment variable
  
  
#### Maven 
  - Download  Maven (v3.8.1) or Greater version [link](https://maven.apache.org/download.cgi) 
  
#### Allure 
  - Download  Allure (v2.15.0) or Greater version [link]( https://github.com/allure-framework/allure2/releases/download/2.15.0/allure-2.15.0.zip)
  


#### Eclips
  - Download Eclips (v4.22.0) [link](https://www.eclipse.org/downloads/)
 
#### Open project and run the tests

  - Open and run the Test Cases
  - Steps for open and run Test Cases
  - Open Eclipse 
  - Click on file -> Open File 
  - Extract the folder -> src -> test -> java -> CucumberTestRunner -> TestRunner.java
  - Right click on TestRunner.java file -> Run As -> Junit Test    
  - Working Successfully.

#### How to generate automation test reports
  
  - Steps for Generate Test Report 
  - Open the project folder (this folder has allure results folder).
  - Now click in the path area and type `cmd` then press enter.
  - cmd will open
  - In cmd type `allure serve` and press enter. 
  - You can see the report in the browser. 
