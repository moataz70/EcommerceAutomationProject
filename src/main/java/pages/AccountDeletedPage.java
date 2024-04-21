package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDeletedPage
{
    private WebDriver driver;
    private By accountDeletedText = By.xpath("//b[text()='Account Deleted!']");
    private By continueButton = By.linkText("/");


    public AccountDeletedPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean isAccountDeletedTextVisible()
    {
        return driver.findElement(accountDeletedText).isDisplayed();
    }

    public HomePage clickContinueButton()
    {
        driver.findElement(continueButton).click();
        return new HomePage(driver);
    }


}
