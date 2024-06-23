package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }
    @FindBy(id = "ap_email")
    private WebElement emailField;
    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "ap_password")
    private WebElement passwordField;

    @FindBy(id = "signInSubmit")
    private WebElement loginButton;

    public void signIn(String email, String password) {
        emailField.isEnabled();
        emailField.sendKeys(email);
        continueButton.isEnabled();
        continueButton.click();
        passwordField.isEnabled();
        passwordField.sendKeys(password);
        loginButton.isEnabled();
        loginButton.click();

    }
}

