package pages;

import constants.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isOnProductsPage(){
        return isDisplayed(Locators.FILTER_LABEL);
    }

    public void selectProduct() {
        scrollToPageEnd();
        seeMoreProductButtonClick();
        scrollToPageEnd();

        //System.out.println(getAllProducts().get(getAllProducts().size()-1));
        getAllProducts().get((int) (Math.random() * getAllProducts().size())).click();
    }
    private List<WebElement> getAllProducts(){
        return findAll(Locators.PRODUCTS);
    }

    public void seeMoreProductButtonClick(){
        click(Locators.SEE_MORE_PRODUCTS_BUTTON);
    }
}
