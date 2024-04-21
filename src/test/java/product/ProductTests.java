package product;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ProductTests extends BaseTest
{
    @Test
    public void verifySearchProduct()
    {
        var productsPage = homePage.clickProducts();
        var searchedProduct = productsPage.searchForProduct("frozen");

        boolean isDisplayed = searchedProduct.isSearchedProductDisplayed();
        assertTrue(isDisplayed);

        //assertEquals()
    }

    @Test
    public void verifyAddingProductsInCart()
    {

    }

    
}
