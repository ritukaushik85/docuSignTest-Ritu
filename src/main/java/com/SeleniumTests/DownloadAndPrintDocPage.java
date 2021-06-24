package com.SeleniumTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** This page object class for Download and Print document page which opens
 * after clicking the link on the SearchResults page */
public class DownloadAndPrintDocPage extends BasePageObject {
    public DownloadAndPrintDocPage(WebDriver driver) {
        super(driver);
    }

    private By ThumbsUpButton = By.xpath("//*[@id=\"vote-up\"]");

    /** verifying the ThumbsUp button is present on the ‘Was this content helpful?’ section   */
    public void verifyThumbsUpButton() {
        System.out.println("Verifying ThumbsUp button present or not");
        waitForVisibilityOf(ThumbsUpButton,5);
        boolean ThumbsUpButtonVisible = find(ThumbsUpButton).isDisplayed();
        if (ThumbsUpButtonVisible) {
            System.out.println("Thumbs up button is present and visible");
        } else {
            System.out.println("Thumbs up button is NOT present and visible");
        }
       /** we can also use the below assertion to verify the ThumbsUp button's presence
        * Assert.assertEquals(true, find(ThumbsUpButton).isDisplayed());
        * */
    }
}
