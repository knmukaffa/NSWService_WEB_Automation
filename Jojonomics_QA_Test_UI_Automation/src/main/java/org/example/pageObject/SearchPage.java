package org.example.pageObject;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public static WebDriver driver;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        SearchPage.driver = driver;
    }

    @FindBy(xpath = "//a[.='Order special number plates as a gift']")
    private WebElement chosenServices;

    @FindBy(xpath = "//a[.='Find a service centre']")
    private WebElement findAServiceCentreBtn;

    @FindBy(xpath = "//h1[@id='page-title']")
    private WebElement findAServiceLocationTitle;

    @FindBy(xpath = "//input[@id='locatorTextSearch']")
    private WebElement locationSearchField;

    @FindBy(xpath = "//button[@class='button button--primary button--xxlarge']")
    private WebElement locationSearchSubmitBtn;

    @FindBy(xpath = "//button[.='Service centres']")
    private WebElement filterBtn;

    public void clickOnChosenServices(){
        chosenServices.click();
    }

    public void clickOnFindAServiceCentreBtn(){
        findAServiceCentreBtn.click();
    }

    public boolean validateFindAServiceLocationPage(){
        return findAServiceLocationTitle.isDisplayed();
    }

    public void inputLocationSearch(String search) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.scrollToElement(locationSearchField).perform();
        locationSearchField.sendKeys(search);
        Thread.sleep(500);
        locationSearchSubmitBtn.click();
    }

    public void clickOnFilterBtn(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(filterBtn).perform();
        filterBtn.click();
    }

    public boolean validateServiceCentreLocationResult(String result) throws InterruptedException {
        WebElement serviceCentreLocationResult = driver.findElement(By.xpath("//a[contains(.,'"+result+"')]"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(serviceCentreLocationResult).perform();
        Thread.sleep(500);
        return serviceCentreLocationResult.isDisplayed();
    }
}
