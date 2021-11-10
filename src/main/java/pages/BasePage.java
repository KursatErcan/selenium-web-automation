package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {
    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement findElement(By locator){return webDriver.findElement(locator);}

    public List<WebElement> findAll(By locator){return webDriver.findElements(locator);}

    public void click(By locator){ findElement(locator).click();}

    public void sendKeys(By locator,String text){findElement(locator).sendKeys(text);}

    public Boolean isDisplayed(By locator){ return findElement(locator).isDisplayed();}

    public void scrollToPageEnd(){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,7511)");
    }
}
