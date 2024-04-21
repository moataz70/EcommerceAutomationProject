package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage
{
    private WebDriver driver;

    public PaymentPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Locators
    private By nameOnCardField = By.xpath("//input[@data-qa='name-on-card']");
    private By cardNumberField = By.xpath("//input[@data-qa='card-number']");
    private By cvcField = By.xpath("//input[@data-qa='cvc']");
    private By expiryMonthField = By.xpath("//input[@data-qa='expiry-month']");
    private By expiryYearField = By.xpath("//input[@data-qa='expiry-year']");
    private By payAndConfirmOrderButton = By.xpath("//input[@data-qa='pay-button']");

    //////////////////Actions\\\\\\\\\\\\\\\\

    public void enterNomeOnCard(String name)
    {
        driver.findElement(nameOnCardField).sendKeys(name);
    }

    public void enterCardNumber(String number)
    {
        driver.findElement(cardNumberField).sendKeys(number);
    }

    public void enterCardCvc(String cvc)
    {
        driver.findElement(cvcField).sendKeys(cvc);
    }

    public void enterExpiryMonth(String month)
    {
        driver.findElement(expiryMonthField).sendKeys(month);
    }

    public void enterExpiryYear(String year)
    {
        driver.findElement(expiryYearField).sendKeys(year);
    }

    public void clickPayAndConfirmButton()
    {
        driver.findElement(payAndConfirmOrderButton).click();
    }


}
