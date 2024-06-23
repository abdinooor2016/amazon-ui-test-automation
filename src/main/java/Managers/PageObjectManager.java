package Managers;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private final WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;
    private ItemsPage itemsPage;
    private CheckoutPage checkoutPage;
    private SearchPage searchPage;


    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }
    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(webDriver) : loginPage;
    }
    public SearchPage getSearchPage() {
        return (searchPage == null) ? searchPage = new SearchPage(webDriver) : searchPage;
    }

    public ItemsPage getItemsPage() {
        return (itemsPage == null) ? itemsPage = new ItemsPage(webDriver) : itemsPage;
    }

    public CheckoutPage getCheckoutPage() {
        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(webDriver) : checkoutPage;
    }
}
