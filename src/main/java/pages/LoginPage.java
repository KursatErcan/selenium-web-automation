package pages;

import constants.Locators;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOnLoginPage() {
        return isDisplayed(Locators.LOGIN_BUTTON);
    }

    public void setEmail(String email) { sendKeys(Locators.LOGIN_EMAIL,email); }

    public void setPassword(String password) { sendKeys(Locators.LOGIN_PASSWORD,password); }

    public String getEmail() { return findElement(Locators.LOGIN_EMAIL).getAttribute("value"); }

    public String getPassword() { return findElement(Locators.LOGIN_PASSWORD).getAttribute("value"); }

    public void login() { click(Locators.LOGIN_BUTTON);
    }
}
