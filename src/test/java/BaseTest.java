import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testLogger.TestResultLogger;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {
    protected static WebDriver webDriver;
    @BeforeAll
    public void setUp(){
        //parametrik hale getir
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://www.lcwaikiki.com/tr-TR/TR");
        webDriver.manage().window().maximize();

    }
    @AfterAll
    public void tearDown(){
        webDriver.quit();
    }
}
