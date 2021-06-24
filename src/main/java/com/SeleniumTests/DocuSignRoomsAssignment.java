package com.SeleniumTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/** Base execution class of Docusign Assignment test */
public class DocuSignRoomsAssignment{

    /** This method is the root method and is calling all methods of the page object classes
     * This will verify the tests on HomePage,SearchResultsPage and DownloadAndPrintPage
     * */
    @Test
    public static void verifyRoomsForRealEstate() throws InterruptedException {

        /** Setting up System Property for Chrome Driver and Instantiating a ChromeDriver class  */
        System.setProperty("webdriver.chrome.driver","/Users/Kaushik/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        /** open main page-The Docusign Support website */
        HomePageObject HomePage = new HomePageObject(driver);
        HomePage.openPage();

        /** Enter search text and Click on Search Button */
        SearchResultsPageObject SearchResultsPage=HomePage.clickSearchButton();

        /** Landing on Search Results page and Verify No of results on SearchResults page */
        SearchResultsPage.verifyNoOfResults();

        /** Finding and Clicking on the Download and Print document link */
        DownloadAndPrintDocPage DownloadAndPrint= SearchResultsPage.findAndClickLink();

        /** Landing on the Download and Print document page and Verifying the ThumbsUp button  */
        DownloadAndPrint.verifyThumbsUpButton();
        /** Closing the driver after all test have been completed */
        driver.quit();
    }
}





