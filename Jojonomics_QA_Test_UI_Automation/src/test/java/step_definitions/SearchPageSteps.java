package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.SearchPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchPageSteps {
    final private WebDriver driver;

    public SearchPageSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @And("User click on chosen services from search result")
    public void userClickOnChosenServicesFromSearchResult() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickOnChosenServices();
    }

    @And("User click on find a service centre button")
    public void userClickOnFindAServiceCentreButton() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickOnFindAServiceCentreBtn();
        Thread.sleep(1000);
    }

    @Then("User already on find a service location page")
    public void userAlreadyOnFindAServiceLocationPage() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertTrue(searchPage.validateFindAServiceLocationPage());
        Thread.sleep(1000);
    }

    @And("User search by suburb \"([^\"]*)\"")
    public void userSearchBySuburb(String search) throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.inputLocationSearch(search);
        Thread.sleep(1000);
    }

    @And("User set filter to service centre")
    public void userSetFilterToServiceCentre() {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.clickOnFilterBtn();
    }

    @And("Service centre search result with name \"([^\"]*)\" should appear")
    public void serviceCentreSearchResultWithNameShouldAppear(String result) throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertTrue(searchPage.validateServiceCentreLocationResult(result));
    }
}
