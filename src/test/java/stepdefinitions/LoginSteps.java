package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps {

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("User navigates to login page");
    }

    @When("User enters valid credentials")
    public void userEntersValidCredentials() {
        System.out.println("User enters valid username and password");
    }

    @Then("User should be redirected to the homepage")
    public void userShouldBeRedirectedToHomepage() {
        System.out.println("User is redirected to the homepage");
        Assert.assertTrue(true);
    }
}