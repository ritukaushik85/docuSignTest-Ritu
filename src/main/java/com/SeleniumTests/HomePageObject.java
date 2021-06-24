package com.SeleniumTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

/** This is the page object class for the main/home Docusign Support page */
public class HomePageObject extends BasePageObject {

    /** Creating/defining the locators  */
    private  String pageUrl = "https://support.docusign.com/en/";
    private  By InputBoxForSearch = By.id("home-search-input");
    private  By SearchButton = By.id("home-search-submit");

    public HomePageObject(WebDriver driver) {
      super(driver);
    }

    /** Open Docusign Support Home page with it's url */
    public void openPage() {
        System.out.println("Opening page: " + pageUrl);
        openUrl(pageUrl);
        driver.manage().window().maximize();
        System.out.println("Page opened!");
    }

    /** Entering text for search and clicking on search button */
    public SearchResultsPageObject clickSearchButton() {
        System.out.println("Enter the text - Rooms for real estate");
        type("Rooms for real estate" ,InputBoxForSearch);
        System.out.println("Clicking Search button on Home Page");
        click(SearchButton);
        return new SearchResultsPageObject(driver);
    }
}
