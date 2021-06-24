package com.SeleniumTests;
import org.openqa.selenium.*;
import org.testng.asserts.SoftAssert;

/** This page object class for SearchResults which opens
 * after clicking the search button on the homepage */
public class SearchResultsPageObject extends BasePageObject {

    /** Creating/defining the locators  */
    private By waiting = By.id("filter-topics");
    private By ResultsLabel = By.id("inbenta-total-results");
    private By DownloadAndPrintLink = By.xpath("//*[@id=\"results\"]/div[23]/div[1]/a/span");
    private By MoreButton = By.id("show-more-button");

    public SearchResultsPageObject(WebDriver driver) {
        super(driver);
    }

    /** Verifying the number of results found on the search page for 'Rooms for Real Estate' */
    public void verifyNoOfResults() {
        System.out.println("Landed on the SearchResults page");
        waitForVisibilityOf(waiting, 2000);

        String ActualNoOfResultsText = find(ResultsLabel).getText();

        /**  Getting the string splitted by space and strong with index */
        String words[] = ActualNoOfResultsText.split("\\s");

        SoftAssert softAssert = new SoftAssert();
        String ExpectedText= "55 Results found for 'Rooms for real estate'";
        softAssert.assertEquals(ExpectedText, ActualNoOfResultsText);
        System.out.println("Assertion done");
        System.out.println("There are " + words[0] + " results found for 'Rooms for real estate'");

        /**  We can use the below code for verifying the above by using simple java If-else statement
          if (ActualNoOfResultsText.contains("55")) {
          System.out.println("There are 55 results found for 'Rooms for real estate'");
          } else {
         System.out.println("There are " + words[0] + " results found for 'Rooms for real estate'");
           }*/
    }

    /** Find and click on the 'Download and Print Documents' link and land on the Download_and_Print_Document_Page */
    public DownloadAndPrintDocPage findAndClickLink() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
           boolean LinkPresent=isElementPresent(DownloadAndPrintLink);
            if(LinkPresent){
                    System.out.println("clicking on Download and Print Document link");
                    click(DownloadAndPrintLink);
                    System.out.println("Download and Print Document link clicked!!!!Landing on ThumbsUp page");
                    break;
            }else {
                click(MoreButton);
                Thread.sleep(2000);/** ---------Please read the note at the end of the program */
            }
        }
        return new DownloadAndPrintDocPage(driver);
        }
    }

   /** Three ways I tried to use Explicit wait for successful click operation but
    * all of these did not work and then I had to use the Thread.sleep();

    1) created method "waitForVisibilityOf(MoreButton, 5000)" and called here ; was still trowing NoSuchElementfoundException
    2) when it was throwing ElementClickInterceptedException: I created "waitForElementToBeClickable(MoreButton, 5000);" and called here;
    3) JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", MoreButton);
     */
