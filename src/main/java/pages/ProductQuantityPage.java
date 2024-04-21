package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductQuantityPage
{
    private WebDriver driver;
    private By quantityField = By.id("quantity");
    private By addToCartButton = By.xpath("//button[@class='btn btn-default cart']");
    private By viewCartButton = By.xpath("//a[@href='/view_cart']");

    public ProductQuantityPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void increaseProductQuantity(String quantity)
    {
        driver.findElement(quantityField).clear();
        driver.findElement(quantityField).sendKeys(quantity);
    }

    public void clickAddToCart()
    {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        driver.findElement(addToCartButton).click();
    }

    public CartPage clickViewCart()
    {
        driver.findElement(viewCartButton).click();
        return new CartPage(driver);
    }
}
