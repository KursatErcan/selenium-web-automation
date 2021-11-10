package pages;

import constants.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(Locators.ADD_TO_CART_BUTTON);
    }

    public void addToCart() {
        // TODO: Stokta bulunan beden ve boy ölçülerini tespit ederek seçmesi gerekiyor
        // Suan sadece ilk beden ölçüsünü ele alıyor
        click(By.xpath("//*[@id=\"option-size\"]/a[1]"));
        click(Locators.ADD_TO_CART_BUTTON);
    }
    public String getProductPrice(){
        return findElement(Locators.PRODUCT_PRICE_IN_PRODUCT_DETAIL_PAGE).getText();
    }






}
