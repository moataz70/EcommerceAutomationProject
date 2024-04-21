package product;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProductQuantityTest extends BaseTest
{
    @Test
    public void verifyIncreasingProductQuantity()
    {
        var productQuantityPage = homePage.clickOnViewProduct();
        productQuantityPage.increaseProductQuantity("4");
        productQuantityPage.clickAddToCart();
        var cartPage = productQuantityPage.clickViewCart();
        String isDisplayed = cartPage.isProductDisplayedInTheCart(1);
        assertEquals(isDisplayed, "women", "incorrect product");

    }
}
