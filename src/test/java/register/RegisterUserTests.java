package register;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AccountCreatedPage;
import pages.AccountInformationPage;
import pages.SignUp_LoginPage;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegisterUserTests extends BaseTest
{
    AccountCreatedPage accountCreatedPage;

    @Test
    public void verifyThatUserRegisterSuccessfully()
    {
        SignUp_LoginPage signUpPage = homePage.clickSignUp_Login();

        boolean isDisplayed = signUpPage.isNewUserSignupVisible();
        assertTrue(isDisplayed);

        signUpPage.signup_SetEmail("16223uy@gmail.com");
        signUpPage.signup_SetName("uf4a");
        AccountInformationPage accountInformationPage = signUpPage.clickSignUpButton();

        boolean isEnterAccountInfoDisplayed = accountInformationPage.isEnterAccountInfoTextVisible();
        assertTrue(isEnterAccountInfoDisplayed);

        accountInformationPage.clickTitle();
        accountInformationPage.account_SetName("mohamed");
        accountInformationPage.account_SetPassword("123456");
        accountInformationPage.AccountInfo_SetDayOfBirth("15");
        accountInformationPage.AccountInfo_SetMonthOfBirth("October");
        accountInformationPage.AccountInfo_SetYearOfBirth("2000");
        accountInformationPage.addressInfo_SetFirstName("banhawy");
        accountInformationPage.addressInfo_SetLastName("bastawy");
        accountInformationPage.addressInfo_SetCompany("Talent Area");
        accountInformationPage.addressInfo_SetAddress1("sfsdgfg");
        accountInformationPage.addressInfo_SetAddress2("zxcvbbn");
        accountInformationPage.addressInfo_SetCountry("India");
        accountInformationPage.addressInfo_SetCity("bangolo");
        accountInformationPage.addressInfo_SetState("newdelhi");
        accountInformationPage.addressInfo_SetZipCode("0022");
        accountInformationPage.addressInfo_SetMobileNumber("0114546288");

        accountCreatedPage = accountInformationPage.clickCreateAccountButton();

    }

    @Test(dependsOnMethods ="verifyThatUserRegisterSuccessfully")
    public void verifyThatAccountCreatedSuccessfully()
    {
        boolean isVisible =accountCreatedPage.isAccountCreatedVisible();
        assertTrue(isVisible);
        accountCreatedPage.clickContinueButton();
    }

    @Test
    public void verifyRegisterUserWithExistingEmail()
    {
        SignUp_LoginPage signUpPage = homePage.clickSignUp_Login();

        boolean isDisplayed = signUpPage.isNewUserSignupVisible();
        assertTrue(isDisplayed);

        signUpPage.signup_SetEmail("16223uy@gmail.com");
        signUpPage.signup_SetName("uf4a");
        signUpPage.clickSignUpButton();
        String errorText = "Email Address already exist!";

        assertEquals(signUpPage.getSignUpErrorText(), errorText, "Error message incorrect");
    }


   /* @Test
    public void verifyThatEnterAccountInfoIsVisible()
    {
        accountInformationPage = signUpPage.clickSignUpButton();
        boolean isDisplayed = accountInformationPage.isEnterAccountInfoTextVisible();
        assertTrue(isDisplayed);
    }*/

}
