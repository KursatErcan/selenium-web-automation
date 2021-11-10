package constants;

import org.openqa.selenium.By;

public class Locators {
    public static final By SEARCH_BOX = By.id("search_input");
    public static final By SEARCH_BUTTON = By.xpath("/html/body/div[2]/div/div[1]/div/header/div[2]/div/div[2]/div/div/div/div[2]/button");
    public static final By SEE_MORE_PRODUCTS_BUTTON = By.xpath("//*[@id=\"divModels\"]/div[7]/div/div[4]/a/p");
    public static final By PRODUCTS = By.className("a_model_item");
    public static final By ADD_TO_CART_BUTTON = By.id("pd_add_to_cart");
    public static final By CART_PAGE_BUTTON = By.className("header-cart");
    public static final By CART_PRODUCT_COUNT = By.className("ignored");//By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[2]");
    public static final By CART_DELETE_PRODUCT = By.className("fa-trash-o");//xpath("//*[@id=\"Cart_ProductDelete_706731024\"]/i");//className("cart-square-link1");
    public static final By LOGIN_PAGE_BUTTON = By.xpath("//*[@id='header__container']/div/header/div[2]/div/div[3]/div[2]/div[1]/a");
    public static final By LOGIN_EMAIL = By.id("LoginEmail");
    public static final By LOGIN_PASSWORD = By.id("Password");
    public static final By LOGIN_BUTTON = By.id("loginLink");
    public static final By HOME_PAGE_CONTAINER = By.id("container"); // TODO: TEST OTOMASYONU OLDUĞU İÇİN LOGİNDE PROBLEM VAR
    public static final By CART_SLIDER = By.id("divCartSlider");
    public static final By PRODUCT_NAME = By.className("rd-cart-item-title");
    public static final By FILTER_LABEL = By.xpath("//*[@id=\"filter-label\"]");
    public static final By PRODUCT_PRICE_IN_CART = By.xpath("(//div[contains(@class,'col-md-4 col-xs-3')]//span)[2]");
    public static final By PRODUCT_PRICE_IN_PRODUCT_DETAIL_PAGE = By.xpath("//*[@id='rightInfoBar']/div[1]/div/div[2]/div/div/div[2]/div[2]");
    public static final By CART_EMPTY_TITLE = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div");
    public static final By DELETE_BUTTON = By.className("sc-delete");//xpath("Cart_ProductDelete_706055111");
}
