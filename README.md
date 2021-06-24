# Docusign Rooms  - Selenium Automation
## About the 'Rooms for real estate' project
The purpose of this project is to automate the Docusign Support website using the Selenium automation .
Below is the navigation flow of the project:
1) Start at the DocuSign support home page: https://support.docusign.com/
2) Search for: Rooms for Real Estate
3) On the results page, perform a verification on the number of “Results found” displayed near the
4) top of the page. Verify there are ‘55’ results found.
5) Find and click on the link for ‘Download and Print Documents - DocuSign Rooms’
6) On the resulting page,verify the [thumbs up] button from the ‘Was this content helpful?’
section exists.

## Technologies/Installation
* Java SE 16.0.1
* IDE - IntelliJ Idea/ Eclipse or any other 
* Selenium webdriver - 3.141.59
* TestNg - testng 7.4.0
* Maven -3.8.1

### Get the source code :
Clone the repository : 
git clone https://github.com/ritukaushik85/rituk-docusignrooms.git
* The project lies in the TestAtomation folder.

## Content - Description and Sub modules organization/flow 

The navigation/Testing through Docusign Rooms website was done using creating **Page Object model(POM)** architecture in Java (Selenium Webdriver)with the use of **TestNg framework**. Below are the classes created:
* Testng.xml - This is the node for running the Test suite. On executing this, it will run all other classes as test and will generate the report.

* DocisignAssignment class- This class is driving class of the project . It contains the @Test notation from TestNg which will drive execution of all methods of the page object classes.

* BasePageObject Class - This is the utility class containing all the custom  methods like ( find,type,click,waitfor etc.) which will be used in the page object classes. This class is the super class of all page object classes.

* HomePageObject class - This is first page object class which will launch the Docusign URL : https://support.docusign.com/ and will search for the 'Rooms for real estate' by typing in the input box and clicking on the search button.

* SearchResultsPageObject class - Once the HomePageObject class's methods search executes ,Search Results page opens , this class will find the 'Download and print document' link and will click on it.

* DownloadAndPrintDocPage class - This class will execute once the Download And PrintDocuments Page opens and will verify if the ThumbsUp button exixts or not in the ‘Was this content helpful?’ section.

## Running the project:  
1) Run the Testng.xml file , the test suite will execute and will generate the report.

## Report generation/Output
*Below* is the output of a *successful* run in the html report:  
file:///Users/Kaushik/TestAutomation/test-output/emailable-report.html

![Screen Shot 2021-06-21 at 12 09 39 AM](https://user-images.githubusercontent.com/86083485/122711047-23bbcd80-d227-11eb-939e-e1bfd99072d3.png)  

<img width="1300" alt="Screen Shot 2021-06-21 at 12 09 58 AM" src="https://user-images.githubusercontent.com/86083485/122711130-4a7a0400-d227-11eb-9393-c02720fc72fb.png">


## Contacts:  
Email : ritukaushik85@gmail.com for any quesions or concerns
