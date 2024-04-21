package contactus;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContactUsTests extends BaseTest
{
    @Test
    public void verifyContactUs()
    {
        var contactUsPage = homePage.clickContactUs();
        contactUsPage.setEmail("awert@hotmail.com");
        contactUsPage.setName("asd");
        contactUsPage.setSubject("mafa");
        contactUsPage.enterYourMessage("thwwdvfvbf  bvbghfgn dfgnbcvbxcbdfhfghfgnhjfghnfgn fgdfgdfgdfg  fbdfgbd  fbf");
        contactUsPage.uploadFile("E:\\programming\\demo\\demoJavaProject\\e-commerceProject");
        contactUsPage.clickSubmit();
        contactUsPage.alert_clickOkButton();
        String expectedMessage = "Success! Your details have been submitted successfully.";
        String actualMessage = contactUsPage.alert_getMessage();
        assertEquals(actualMessage,expectedMessage,"Message incorrect!");


    }
}
