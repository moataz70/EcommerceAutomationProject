package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage
{
    private WebDriver driver;

    private By item1 = By.xpath("//a[@href='/product_details/1']");
    private By item2 = By.xpath("//a[@href='/product_details/2']");
    private By item = By.xpath("cart_product");
    private By itemPrice = By.xpath("//td[@class='cart_price']");
    private By itemQuantity = By.xpath("//td[@class='cart_quantity']");
    private By totalPrice = By.xpath("//p[@class='cart_total_price']");
    private By subscriptionText  = By.xpath("//h2[text()='Subscription']");
    private By subscriptionEmailField = By.xpath("//input[@id='susbscribe_email']");
    private By subscribeButton = By.id("subscribe");
    private By footer = By.id("footer");
    private By proceedToCheckoutButton = By.xpath("//a[text()='Proceed To Checkout']");
    private By registerLoginButton = By.xpath("//p[text()='Register / Login account to proceed on checkout.'");




    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getItem1Text()
    {
        return driver.findElement(item1).getText();
    }

    public String getItem2Text()
    {
        return driver.findElement(item2).getText();
    }

    public String isProductDisplayedInTheCart(int itemIndex)
    {
         WebElement itemInTheCart = driver.findElements(item).get(itemIndex-1);
         return itemInTheCart.getText();
    }

    public String getItemPrice(int index)
    {
        WebElement price = driver.findElements(itemPrice).get(index-1);
        return price.getText();
    }

    public String getItemQuantity(int index)
    {
        WebElement quantity = driver.findElements(itemQuantity).get(index-1);
        return quantity.getText();
    }

    public String getTotalPrice(int index)
    {
        WebElement totalPrice = driver.findElements(this.totalPrice).get(index-1);
        return totalPrice.getText();
    }

    public boolean isSubscriptionTextDisplayed()
    {
        return driver.findElement(subscriptionText).isDisplayed();
    }

    public void enterSubscriptionEmail(String email)
    {
        driver.findElement(subscriptionEmailField).sendKeys(email);
        driver.findElement(subscribeButton).click();
    }

    public void scrollToFooter()
    {
        WebElement footer = driver.findElement(this.footer);
        String script = "arguments[0].scrollIntoView";
        ((JavascriptExecutor)driver).executeScript(script,footer);
    }

    public void whileRegister_ProceedToCheckout()
    {
        driver.findElement(proceedToCheckoutButton).click();
    }

    public CheckoutPage whileLoggedIn_ProceedToCheckout()
    {
        driver.findElement(proceedToCheckoutButton).click();
        return new CheckoutPage(driver);
    }

    public SignUp_LoginPage whileCheckout_clickRegisterLoginButton()
    {
        driver.findElement(registerLoginButton).click();
        return new SignUp_LoginPage(driver);
    }


}
