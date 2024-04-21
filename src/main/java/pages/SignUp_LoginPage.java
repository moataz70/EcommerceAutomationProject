package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp_LoginPage
{
    //h2[contains(text(), "New User Signup!")]
    //input[@data-qa='signup-name']
    //input[@data-qa='signup-email']
    //button[@data-qa='signup-button']
    private WebDriver driver;
    private By newUserSignUpText = By.xpath("//h2[contains(text(),'New User Signup!')]");
    private By signUp_nameField = By.xpath("//input[@data-qa='signup-name']");
    private By signUp_emailField = By.xpath("//input[@data-qa='signup-email']");
    //private By signUpButton = By.xpath("//button[@data-qa=\"signup-button\"]");
    //private By signUpButton = By.xpath("//*[@id='form']/div/div/div[3]/div/form/button");
    private By signUpButton = By.cssSelector("button[data-qa='signup-button']");
    private By signUp_ErrorMessage = By.xpath("//p[@style=\"color: red;\"]");

    private By login_EmailField = By.xpath("//input[@data-qa='login-email']");
    private By login_PasswordField = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");
    private By login_ErrorMessage = By.xpath("//p[@style=\"color: red;\"]");



    public SignUp_LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean isNewUserSignupVisible()
    {
       return  driver.findElement(newUserSignUpText).isDisplayed();
    }

    public void signup_SetName(String name)
    {
        driver.findElement(signUp_nameField).sendKeys(name);
    }

    public void signup_SetEmail(String email)
    {
        driver.findElement(signUp_emailField).sendKeys(email);
    }

    public AccountInformationPage clickSignUpButton()
    {
        driver.findElement(signUpButton).click();
        return new AccountInformationPage(driver);
    }


    public void login_SetEmailAndPassword(String email, String  password)
    {
        driver.findElement(login_EmailField).sendKeys(email);
        driver.findElement(login_PasswordField).sendKeys(password);
    }

    public void clickLoginButton()
    {
        driver.findElement(loginButton).click();
    }

    public String getLoginErrorText()
    {
        return driver.findElement(login_ErrorMessage).getText();
    }

    public String getSignUpErrorText()
    {
        return driver.findElement(signUp_ErrorMessage).getText();
    }

}
