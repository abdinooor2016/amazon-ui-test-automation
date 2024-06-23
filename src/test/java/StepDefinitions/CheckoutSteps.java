package StepDefinitions;

import PageObjects.*;
import Utilities.TestContext;
import io.cucumber.java.en.Given;

public class CheckoutSteps {

    TestContext testContext;
    HomePage homePage;
    LoginPage loginPage;
    SearchPage searchPage;
    ItemsPage itemsPage;
    CheckoutPage checkoutPage;

    public CheckoutSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage = testContext.getPageObjectManager().getLoginPage();
        searchPage = testContext.getPageObjectManager().getSearchPage();
        itemsPage = testContext.getPageObjectManager().getItemsPage();
        checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
    }


    @Given("User goes to checkout with an item")
    public void goToCheckoutWithAnItem() {
        homePage.clickUserAccountIcon();
        loginPage.signIn("testusernameamazon123@gmail.com", "password123!_");
        homePage.searchItem("shoes");
        searchPage.selectFirstItem();
        itemsPage.clickBuyNow();
//        checkoutPage.clickCardLink();
//        checkoutPage.addCardInfo("asas", "sas", "asas");
    }
}
