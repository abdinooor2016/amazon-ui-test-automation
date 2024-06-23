package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.TestContext;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CommonSteps {
    TestContext testContext;
    LoginPage loginPage;

    HomePage homePage;



    public CommonSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage = testContext.getPageObjectManager().getLoginPage();

    }
    @Then("{string} text displayed")
    public void isdisplayed(String type) {
        switch (type) {
            case "Hello, Test":
                Assert.assertEquals(homePage.loggedUserNameIconText(), "Hello, Test");
                break;
        }
    }
}
