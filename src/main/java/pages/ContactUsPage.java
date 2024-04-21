package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage
{
    private WebDriver driver;
    private By nameField = By.xpath("//input[@data-qa=\"name\"]");
    private By emailField = By.xpath("//input[@data-qa=\"email\"]");
    private By subjectField = By.xpath("//input[@data-qa=\"subject\"]");
    private By messageField = By.xpath("//textarea[@data-qa=\"message\"]");
    private By chooseFileButton = By.xpath("//input[@name=\"upload_file\"]");
    private By submitButton = By.xpath("//input[@data-qa=\"submit-button\"]");
    private By alert_resultMessage = By.xpath("//div[text()='Success! Your details have been submitted successfully.']");

    public ContactUsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setName(String name)
    {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setSubject(String subject)
    {
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void enterYourMessage(String text)
    {
        driver.findElement(messageField).sendKeys(text);
    }

    public void uploadFile(String absolutePathOfField)
    {
        driver.findElement(chooseFileButton).sendKeys(absolutePathOfField);
    }

    public void clickSubmit()
    {
        driver.findElement(submitButton).click();
    }

    public void alert_clickOkButton()
    {
        driver.switchTo().alert().accept();
    }

    public String alert_getMessage()
    {
        return driver.findElement(alert_resultMessage).getText();
    }

}
