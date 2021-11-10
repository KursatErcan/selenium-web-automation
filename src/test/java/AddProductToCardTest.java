import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.ProductsPage;

public class AddProductToCardTest extends BaseTest{
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;


    @Test
    @Order(1)
    public void searchProduct(){
        homePage = new HomePage(webDriver);
        productsPage = new ProductsPage(webDriver);
        homePage.searchBox().search("pantolon");
        Assertions.assertTrue(productsPage.isOnProductsPage(), "Not on products page!");
    }

    @Test
    @Order(2)
    public void selectProduct(){
        productDetailPage = new ProductDetailPage(webDriver);
        productsPage.selectProduct();
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page!");
    }
    @Test
    @Order(3)
    public void addProductToCart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),"Product count not increase!");
    }
    @Test
    @Order(4)
    public void checkPrice(){
        cartPage = new CartPage(webDriver);
        String detailPagePrice = productDetailPage.getProductPrice();
        homePage.goToCart();
        String cartPagePrice = cartPage.getProductPrice();
        Assertions.assertEquals(detailPagePrice, cartPagePrice,"The price on the product page and the price of the product in the cart are not the same!");
    }
    @Test
    @Order(5)
    public void goToCart(){
        homePage.goToCart();
        cartPage = new CartPage(webDriver);
        Assertions.assertTrue(cartPage.checkIfProductAdded(),"Product was not added to card!");
    }
    @Test
    @Order(6)
    public void increaseProductCount(){
        cartPage.increaseProductCount();
        System.out.println(cartPage.getProductCount());
        Assertions.assertTrue(cartPage.getProductCount().contains("2"),"Product was not added quantity to card!");
    }
    @Test
    @Order(7)
    public void deleteProduct(){
        cartPage.deleteProduct();
        Assertions.assertTrue(cartPage.getCartEmptyTitle(),"Product was not added quantity to card!");

    }

}
