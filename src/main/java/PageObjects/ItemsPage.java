package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ItemsPage {

    public ItemsPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(id ="buy-now-button")
    private WebElement buyNowButton;


    public void clickBuyNow() {
        buyNowButton.isEnabled();
        buyNowButton.click();
    }

}
