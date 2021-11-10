package pages;

import constants.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class CartPage extends BasePage {

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size()>0;
    }

    private List<WebElement> getProducts() {
        return findAll(Locators.PRODUCT_NAME);
    }

    public String getProductCount(){
        return findElement(Locators.CART_PRODUCT_COUNT).getText();
    }
    public String getProductPrice(){
        return findElement(Locators.PRODUCT_PRICE_IN_CART).getText();
    }
    public void increaseProductCount() {
        By increaseBtn = By.className("plus");
        click(increaseBtn);
    }

    public void deleteProduct() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

        System.out.println("BURADA : "+Locators.CART_DELETE_PRODUCT);
        click(Locators.CART_DELETE_PRODUCT);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

        if(isDisplayed(Locators.DELETE_BUTTON)) click(Locators.DELETE_BUTTON);
    }

    public Boolean getCartEmptyTitle() {
        return isDisplayed(Locators.CART_EMPTY_TITLE);
    }
}
