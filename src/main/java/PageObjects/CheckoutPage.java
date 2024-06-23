package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @FindBy(className ="apx-add-pm-trigger-image")
    private WebElement cardLink;

    @FindBy(className ="addCreditCardNumber")
    private WebElement cardNumberField;

    @FindBy(className ="ppw-accountHolderName")
    private WebElement cardNameField;

    @FindBy(className ="addCreditCardVerificationNumber")
    private WebElement securityCodeField;

    @FindBy(className ="ppw-widgetEvent:AddCreditCardEvent")
    private WebElement cardButton;

    @FindBy(css ="#header > div > div.a-column.a-span8 > h1")
    private WebElement checkoutHeader;

    public void clickCardLink() {
        cardLink.isEnabled();
        cardLink.click();
    }

    public void addCardInfo(String cardNumber, String cardName, String securityCode) {
        driver.switchTo().frame(1);
        cardNumberField.isEnabled();
        cardNumberField.sendKeys(cardNumber);
        cardNameField.isEnabled();
        cardNameField.sendKeys(cardName);
        securityCodeField.isEnabled();
        securityCodeField.sendKeys(securityCode);
        cardButton.isEnabled();
        cardButton.click();

    }

    public String checkoutHeaderText() {
        checkoutHeader.isDisplayed();
        return checkoutHeader.getText();
    }

}
