package pages;

import constants.Locators;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

    public SearchBox(WebDriver webDriver) {
        super(webDriver);
    }

    public void search(String text) {
        click(Locators.SEARCH_BOX);
        sendKeys(Locators.SEARCH_BOX,Keys.CONTROL + "a");
        sendKeys(Locators.SEARCH_BOX,Keys.DELETE+"");
        sendKeys(Locators.SEARCH_BOX,text);
        click(Locators.SEARCH_BUTTON);
    }
}
