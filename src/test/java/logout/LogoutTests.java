package logout;

import base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignUp_LoginPage;


public class LogoutTests extends BaseTest
{
    @BeforeMethod
    public void beforeMethod()
    {
        SignUp_LoginPage signUpLoginPage = homePage.clickSignUp_Login();
        signUpLoginPage.login_SetEmailAndPassword("16223uy@gmail.com","123456");
        signUpLoginPage.clickLoginButton();
    }

    @Test
    public void verifyValidLogout()
    {
        homePage.clickLogoutButton();
    }

    @AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}


