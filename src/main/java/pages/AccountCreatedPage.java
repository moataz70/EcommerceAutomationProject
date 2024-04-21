package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage {

    private WebDriver driver;
    private By accountCreatedText = By.xpath("//b[text()='Account Created!']");
    private By continueButton = By.xpath("//a[@data-qa='continue-button']");

    public AccountCreatedPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public boolean isAccountCreatedVisible()
    {
        return driver.findElement(accountCreatedText).isDisplayed();
    }

    public HomePage clickContinueButton()
    {
        driver.findElement(continueButton).click();
        return new HomePage(driver);
    }
}
