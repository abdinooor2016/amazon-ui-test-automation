package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SearchPage {

    public SearchPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(css ="div[data-index='3']")
    private WebElement clickItem;

    @FindBy(id ="ap_email")
    private WebElement emailField;

    public void selectFirstItem() {
        clickItem.isDisplayed();
        clickItem.click();

    }

}
