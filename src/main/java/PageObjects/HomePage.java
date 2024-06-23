package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(id ="nav-link-accountList-nav-line-1")
    private WebElement userAccountIcon;

    @FindBy(id ="twotabsearchtextbox")
    private WebElement searchField;

    @FindBy(id ="nav-search-submit-button")
    private WebElement searchButton;

    public void clickUserAccountIcon() {
        userAccountIcon.isDisplayed();
        userAccountIcon.isEnabled();
        userAccountIcon.click();
    }

    public String loggedUserNameIconText() {
        userAccountIcon.isDisplayed();
        return userAccountIcon.getText();
    }

    public void searchItem(String item) {
        searchField.isEnabled();
        searchField.sendKeys(item);
        searchButton.isEnabled();
        searchButton.click();
    }
}
