package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage
{
    private WebDriver driver;

    //Locators
    private By searchProductField = By.id("search_product");
    private By searchButton = By.id("submit_search");
    private By productBox = By.className("product-image-wrapper");
    private By viewProductButton = By.linkText("/product_details/1");
   // private By addToCartButton = By.className("//a[contains(text(),id="+idNumber+")]");
    private By continueShoppingButton = By.xpath("//button[text()='Continue Shopping']");
    private By viewCartButton = By.xpath("//a[@href='/view_cart']");
    private By closeAdsButton = By.id("dismiss-button");
    private By getAddToCartButton(String itemName)
    {
        return By.xpath("//div[@class='overlay-content']//p[text()='" + itemName + "']//following-sibling::a[text()='Add to cart']");
    }



    public ProductsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    ////////////////////Actions\\\\\\\\\\\\\\\\\\\\

    public ProductDetailPage clickViewProduct_FirstProduct()
    {
        driver.findElement(viewProductButton).click();
        return new ProductDetailPage(driver);
    }


    public SearchedProductsPage searchForProduct(String text)
    {
        driver.findElement(searchProductField).sendKeys(text);
        driver.findElement(searchButton).click();
        return new SearchedProductsPage(driver);
    }

    public void hoverOverProduct(int index)
    {
        WebElement product = driver.findElements(productBox).get(index-1);
        //WebElement addToCart = driver.findElements(addToCartButton).get(index-1);
        Actions actions = new Actions(driver);
       // actions.moveToElement(product).moveToElement(addToCart).click().perform();
        actions.moveToElement(product).perform();
        //driver.findElement(addToCartButton).click();
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(product));*/
    }

    public void clickAddToCart(String itemName)
    {
        driver.findElement(getAddToCartButton(itemName)).click();
    }

    public void clickContinueShopping()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement continueShopping = driver.findElement(continueShoppingButton);
        wait.until(ExpectedConditions.visibilityOf(continueShopping));
        driver.findElement(continueShoppingButton).click();
    }

    public  CartPage clickViewCart()
    {
        driver.findElement(viewCartButton).click();
        return new CartPage(driver);
    }

    public void closeAds()
    {
        driver.findElement(closeAdsButton).click();
    }


}
