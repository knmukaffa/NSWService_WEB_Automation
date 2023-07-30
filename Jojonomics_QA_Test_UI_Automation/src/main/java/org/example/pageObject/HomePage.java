package org.example.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {

    public static WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        HomePage.driver = driver;
    }

    @FindBy(xpath = "//section[@class='personalised-content']/div[@class='region']/div[1]//div[@class='page-hero__hero']")
    private WebElement homePageHeader;

    @FindBy(xpath = "//section[@class='personalised-content']/div[@class='region']/div[1]//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//section[@class='personalised-content']/div[@class='region']/div[1]//button[@class='button button--primary']")
    private WebElement submitSearchBtn;

    @FindBy(xpath = "//h2[@class='search__title']")
    private WebElement searchResultTitle;

    public boolean validateHomePageHeader() {
        return homePageHeader.isDisplayed();
    }

    public void inputSearch(String search) throws InterruptedException {
        searchField.sendKeys(search);
        Thread.sleep(1000);
        submitSearchBtn.click();
    }

    public String validateSearchResult(){
        return searchResultTitle.getText();
    }
}
