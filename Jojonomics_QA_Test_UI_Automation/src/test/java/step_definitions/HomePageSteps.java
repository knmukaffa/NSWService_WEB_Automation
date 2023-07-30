package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.pageObject.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    final private WebDriver driver;

    public HomePageSteps() {
        super();
        this.driver = Hooks.webDriver;
    }

    @Given("User already at home page")
    public void userAlreadyAtHomePage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.validateHomePageHeader());
    }

    @When("User search for \"([^\"]*)\"")
    public void userSearchFor(String search) throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.inputSearch(search);
        Thread.sleep(1000);
    }

    @Then("^Search result for \"([^\"]*)\" will appear$")
    public void searchResultWillAppear(String search) {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.validateSearchResult().contains(search) );
    }
}
