package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {

    TestContext testContext;
    HomePage homePage;
    LoginPage loginPage;

    public LoginSteps(TestContext context) {

        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("User clicks the user account icon in homepage")
    public void userClickAccountIcon() {
        homePage.clickUserAccountIcon();
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @When("The user signs in with correct credentials")
    public void userSignsWithCorrectCredentials() {
        loginPage.signIn("testusernameamazon123@gmail.com", "password123!_");

    }
}
