package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountInformationPage {

   private WebDriver driver;

   public AccountInformationPage(WebDriver driver)
   {
      this.driver = driver;
   }

   private By enterAccountInfo_Text = By.xpath("//b[text()='Enter Account Information']");
   private By accountInfo_titleMr = By.id("id_gender1");
   private By accountInfo_nameField = By.id("name");
   private By accountInfo_emailField= By.id("email");
   private By accountInfo_passwordField = By.id("password");
   private By accountInfo_dayOfBirthField = By.id("days");
   private By accountInfo_monthOfBirthField = By.id("months");
   private By accountInfo_yearOfBirthField = By.id("years");
   private By addressInfo_FirstNameField = By.id("first_name");
   private By addressInfo_LastNameField = By.id("last_name");
   private By addressInfo_CompanyField = By.id("company");
   private By addressInfo_Address1Field = By.id("address1");
   private By addressInfo_Address2Field = By.id("address2");
   private By addressInfo_CountryField = By.id("country");
   private By addressInfo_StateField = By.id("state");
   private By addressInfo_CityField = By.id("city");
   private By addressInfo_ZipcodeField = By.id("zipcode");
   private By addressInfo_MobNumberField = By.id("mobile_number");
   private By createAccountButton = By.className("btn-default");
   private By newsletter = By.id("newsletter");
   private By receiveOffers = By.id("optin");





   public boolean  isEnterAccountInfoTextVisible()
   {
      return driver.findElement(enterAccountInfo_Text).isDisplayed();
   }

   public void clickTitle()
   {
      driver.findElement(accountInfo_titleMr).click();
   }

   public void account_SetName(String name)
   {
      driver.findElement(accountInfo_nameField).sendKeys(name);
   }

   public void account_SetEmail(String email)
   {
      driver.findElement(accountInfo_emailField).sendKeys(email);
   }

   public void account_SetPassword(String password)
   {
      driver.findElement(accountInfo_passwordField).sendKeys(password);
   }

   public void AccountInfo_SetDayOfBirth(String option)
   {
      findDropdownElement(accountInfo_dayOfBirthField).selectByVisibleText(option);
   }

   public void AccountInfo_SetMonthOfBirth(String option)
   {
      findDropdownElement(accountInfo_monthOfBirthField).selectByVisibleText(option);
   }

   public void AccountInfo_SetYearOfBirth(String option)
   {
      findDropdownElement(accountInfo_yearOfBirthField).selectByVisibleText(option);
   }

   public void clickSignUpForNewsletter()
   {
      driver.findElement(newsletter).click();
   }

   public void clickReceiveOffers()
   {
      driver.findElement(receiveOffers).click();
   }

   public void addressInfo_SetFirstName(String firstName)
   {
      driver.findElement(addressInfo_FirstNameField).sendKeys(firstName);
   }

   public void addressInfo_SetLastName(String firstName)
   {
      driver.findElement(addressInfo_LastNameField).sendKeys(firstName);
   }

   public void addressInfo_SetCompany(String company)
   {
      driver.findElement(addressInfo_CompanyField).sendKeys(company);
   }

   public void addressInfo_SetAddress1(String address1)
   {
      driver.findElement(addressInfo_Address1Field).sendKeys(address1);
   }

   public void addressInfo_SetAddress2(String address2)
   {
      driver.findElement(addressInfo_Address2Field).sendKeys(address2);
   }

   public void addressInfo_SetCountry(String option)
   {
      findDropdownElement(addressInfo_CountryField).selectByVisibleText(option);
   }

   public void addressInfo_SetState(String state)
   {
      driver.findElement(addressInfo_StateField).sendKeys(state);
   }

   public void addressInfo_SetCity(String city)
   {
      driver.findElement(addressInfo_CityField).sendKeys(city);
   }

   public void addressInfo_SetZipCode(String zipCode)
   {
      driver.findElement(addressInfo_ZipcodeField).sendKeys(zipCode);
   }

   public void addressInfo_SetMobileNumber(String mobNumber)
   {
      driver.findElement(addressInfo_MobNumberField).sendKeys(mobNumber);
   }

   public AccountCreatedPage clickCreateAccountButton()
   {
      driver.findElement(createAccountButton).click();
      return new AccountCreatedPage(driver);
   }


   private Select findDropdownElement(By locator)
   {
      return new Select(driver.findElement(locator));
   }


}
