package cart;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartTests extends BaseTest
{
    @Test
    public void verifySubscriptionInCartPage()
    {
        var cartPage = homePage.clickCartButton();
        cartPage.scrollToFooter();
        cartPage.enterSubscriptionEmail("nmnm@hotmail.com");
        boolean isDisplayed = cartPage.isSubscriptionTextDisplayed();
        assertTrue(isDisplayed, "Text Incorrect");
    }
}
