package pages;

import constants.Locators;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final SearchBox searchBox;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        searchBox = new SearchBox(webDriver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() { return isDisplayed(Locators.CART_SLIDER); }

    public void goToCart() {
        click(Locators.CART_PAGE_BUTTON);
    }

    public boolean isOnHomePage() { return isDisplayed(Locators.HOME_PAGE_CONTAINER); }

    public void goToLoginPage() {
        click(Locators.LOGIN_PAGE_BUTTON);
    }
}
