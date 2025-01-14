package steps;

import pages.LoginPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the SauceDemo login page")
    public void iAmOnTheSauceDemoLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the products page")
    public void iShouldBeRedirectedToTheProductsPage() {
        Assert.assertTrue(loginPage.isProductsPageDisplayed(), "Failed to navigate to the products page.");
    }
}