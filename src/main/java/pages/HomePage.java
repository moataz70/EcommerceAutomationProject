package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage
{
    private WebDriver driver;

    //Locators
    private By signup_LoginButton = By.xpath("//a[@href='/login']");
    private By loggedInAsUserNameButton = By.className("fa-user");
    private By deleteAccountButton = By.linkText("delete_account");
    private By logoutButton = By.linkText("Logout");
    private By contactUsButton = By.xpath("//a[contains(.,' Contact us')]");
    private By productsButton = By.xpath("//a[contains(.,' Products')]");
    private By viewProductButton = By.xpath("//a[@href='/product_details/2']");
    private By cartButton = By.xpath("//a[@href='/view_cart']");
    private By testCasesButton = By.xpath("//a[@href='/test_cases']");
    private By continueShoppingButton = By.xpath("//button[text()='Continue Shopping']");
    private By productBox = By.className("product-image-wrapper");
    private By getAddToCartButton(String itemName)
        {
            //return By.xpath("//a[@data-product-id='" + idNumber + "']");
            return By.xpath("//div[@class='overlay-content']//p[text()='" + itemName + "']//following-sibling::a[text()='Add to cart']");
        }


    //Constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    ////////////////////Actions\\\\\\\\\\\\\\\\\\\\

    public SignUp_LoginPage clickSignUp_Login()
    {
        click(signup_LoginButton);
        return new SignUp_LoginPage(driver);
    }

    public void isLoggedInAsUserNameVisible()
    {
        driver.findElement(loggedInAsUserNameButton).isDisplayed();
    }

    public AccountDeletedPage clickDeleteAccountButton()
    {
        click(deleteAccountButton);
        return new AccountDeletedPage(driver);
    }

    public ContactUsPage clickContactUs()
    {
        click(contactUsButton);
        return new ContactUsPage(driver);
    }

    public void clickLogoutButton()
    {
        click(logoutButton);
    }

    public ProductsPage clickProducts()
    {
        click(productsButton);
        return new ProductsPage(driver);
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

    public void clickContinueShoppingButton()
    {
        driver.findElement(continueShoppingButton).click();
    }

    public ProductQuantityPage clickOnViewProduct()
    {
        click(viewProductButton);
        return new ProductQuantityPage(driver);
    }

    public CartPage clickCartButton()
    {
        click(cartButton);
        return new CartPage(driver);
    }

    public TestCasesPage clickTestCasesButton()
    {
        click(testCasesButton);
        return new TestCasesPage(driver);
    }

    private void click(By locator)
    {
        driver.findElement(locator).click();
    }
}
