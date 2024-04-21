package product;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddToCartTests extends BaseTest
{
    @Test
    public void verifyAddingProductsInCart()
    {
        var productsPage = homePage.clickProducts();
        productsPage.hoverOverProduct(1);
        productsPage.clickAddToCart("Blue Top");
        productsPage.clickContinueShopping();


        productsPage.hoverOverProduct(2);
        productsPage.clickAddToCart("Men Tshirt");

        var cartPage = productsPage.clickViewCart();

        String item1 = cartPage.getItem1Text();
        assertEquals(item1, "Blue Top", "Product incorrect");

        String item2 = cartPage.getItem2Text();
        assertEquals(item2, "Men Tshirt", "Product incorrect");

        String item1Price = cartPage.getItemPrice(1);
        assertEquals(item1Price, "Rs. 500", "Price Incorrect");

        String item2Price = cartPage.getItemPrice(2);
        assertEquals(item2Price, "Rs. 400", "Price incorrect");

        String item1Quantity = cartPage.getItemQuantity(1);
        assertEquals(item1Quantity, "1", "Quantity incorrect");

        String item2Quantity = cartPage.getItemQuantity(2);
        assertEquals(item2Quantity, "1", "Quantity incorrect");

        String total1 = cartPage.getTotalPrice(1);
        assertEquals(total1, "Rs. 500", "Total price incorrect");

        String total2 = cartPage.getTotalPrice(2);
        assertEquals(total2, "Rs. 400", "Total price incorrect");

        cartPage.scrollToFooter();
        boolean isDisplayed = cartPage.isSubscriptionTextDisplayed();
        assertTrue(isDisplayed);
        cartPage.enterSubscriptionEmail("man@hotmail.com");

    }
}
