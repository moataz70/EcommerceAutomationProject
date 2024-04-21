package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SignUp_LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest
{
    @Test
    public void verifyValidLogin()
    {
        SignUp_LoginPage signUpLoginPage = homePage.clickSignUp_Login();
        signUpLoginPage.login_SetEmailAndPassword("16223uy@gmail.com","123456");
        signUpLoginPage.clickLoginButton();
        homePage.clickLogoutButton();

    }

    @Test
    public void VerifyLoginWithInvalidCredential()
    {
        SignUp_LoginPage signUpLoginPage = homePage.clickSignUp_Login();
        signUpLoginPage.login_SetEmailAndPassword("1uy@gmail.com","12 3");
        signUpLoginPage.clickLoginButton();
        String errorMessage = "Your email or password is incorrect!";
        assertEquals(signUpLoginPage.getLoginErrorText(), errorMessage, "Error message incorrect!");
    }


}
