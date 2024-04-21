package register;

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RegisterWhileCheckoutTests extends BaseTest
{
    @Test
    public void stepsBeforeCheckout()
    {
        homePage.hoverOverProduct(1);
        homePage.clickAddToCart("Blue Top");
        homePage.clickContinueShoppingButton();

        var cartPage = homePage.clickCartButton();
        cartPage.whileRegister_ProceedToCheckout();

        var signup_LoginPage = cartPage.whileCheckout_clickRegisterLoginButton();
        signup_LoginPage.signup_SetName("mo2a");
        signup_LoginPage.signup_SetEmail("www@hotmail.com");

        var accountInformationPage = signup_LoginPage.clickSignUpButton();
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

        var accountCreatedPage = accountInformationPage.clickCreateAccountButton();
        accountCreatedPage.isAccountCreatedVisible();

        var homePage = accountCreatedPage.clickContinueButton();
        homePage.isLoggedInAsUserNameVisible();
    }

       /* @Test
        public void verifyPlaceOrder()
        {
        var cartPage = homePage.clickCartButton();
        var checkoutPage = cartPage.whileLoggedIn_ProceedToCheckout();
        checkoutPage.enterCommentAboutYourOrder("what");
        var paymentPage = checkoutPage.clickPlaceOrderButton();
        paymentPage.enterCardNumber("122345678912345");
        paymentPage.enterExpiryMonth("10");
        paymentPage.enterExpiryYear("26");
        paymentPage.enterNomeOnCard("Tahany");
        paymentPage.enterCardCvc("123");
        paymentPage.clickPayAndConfirmButton();
        }*/
}
