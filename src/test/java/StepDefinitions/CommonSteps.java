package StepDefinitions;

import PageObjects.CheckoutPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.TestContext;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CommonSteps {
    TestContext testContext;
    LoginPage loginPage;
    HomePage homePage;

    CheckoutPage checkoutPage;




    public CommonSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage = testContext.getPageObjectManager().getLoginPage();
        checkoutPage = testContext.getPageObjectManager().getCheckoutPage();


    }
    @Then("{string} text displayed")
    public void isdisplayed(String type) {
        switch (type) {
            case "Hello, Test":
                Assert.assertEquals(homePage.loggedUserNameIconText(), "Helloo, Test");
                break;
            case "Checkout (1 item)":
                Assert.assertEquals(checkoutPage.checkoutHeaderText(), "Checkout (1 item)");
                break;
        }
    }
}
