import constants.Variables;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
    LoginPage loginPage;
    HomePage homePage;

    @Test
    @Order(1)
    public void goToLoginPage(){
        loginPage= new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        homePage.goToLoginPage();
        Assertions.assertTrue(loginPage.isOnLoginPage(),"Not on login page!");
    }
    @Test
    @Order(2)
    public void setEmail(){
        loginPage.setEmail(Variables.email);
        Assertions.assertEquals(Variables.email,loginPage.getEmail(),"Name value is not correct!");
    }
    @Test
    @Order(3)
    public void setPassword(){
        loginPage.setPassword(Variables.password);
        Assertions.assertEquals(Variables.password,loginPage.getPassword(),"Last name value is not correct!");
    }

    @Test
    @Order(4)
    public void logIn(){
        loginPage.login();
        Assertions.assertTrue(homePage.isOnHomePage(),"Product count not increase!");
    }
}
