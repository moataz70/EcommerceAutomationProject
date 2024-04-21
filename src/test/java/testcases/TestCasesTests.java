package testcases;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCasesTests extends BaseTest
{
    @Test
    public void verifyLandingToTestCasesPage()
    {
        var testCasesPage = homePage.clickTestCasesButton();
        String text = testCasesPage.getPageTitle();
        assertEquals(text, "Automation Practice Website for UI Testing - Test Cases", "Page title incorrect");
    }
}
