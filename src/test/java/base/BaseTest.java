package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest

{
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        homePage = new HomePage(driver);
        //goHome();

    }

    /*@AfterClass
    public void goHome()
    {
        driver.get("https://automationexercise.com/");
        homePage = new HomePage(driver);
    }*/

   /* @AfterClass
    public void tearDown()
    {
        driver.quit();
    }*/
}
