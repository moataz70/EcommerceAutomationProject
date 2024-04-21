package pages;

import org.openqa.selenium.WebDriver;

public class TestCasesPage
{
    private WebDriver driver;

    //Constructor
    public TestCasesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }
}
