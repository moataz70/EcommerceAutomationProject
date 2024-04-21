package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchedProductsPage
{
    private WebDriver driver;

    private By searchedProductText = By.xpath("//h2[text()='Searched Products']");

    public SearchedProductsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean isSearchedProductDisplayed()
    {
        return driver.findElement(searchedProductText).isDisplayed();
    }
}
