package tests;

import base.BaseTest;
import base.GoogleDataProvider;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.GoogleLoginEmailPage;
import pages.GoogleLoginPassPage;

public class GoogleTests extends BaseTest {

    @Test(dataProvider = "searchPatternDataProvider", dataProviderClass = GoogleDataProvider.class)
    public void searchNoLoginTest(String searchPattern){
        googleSearchPage.enterSearchText(searchPattern);
        googleSearchPage.clickSearchButton();
        Assert.assertTrue(googleSearchPage.isSearchFound(searchPattern));
    }

    @Test
    public void loginTest() {
        GoogleLoginEmailPage googleLoginEmailPage = googleSearchPage.clickSignInButton();

        googleLoginEmailPage.enterEmail("automationthings@gmail.com");
        GoogleLoginPassPage googleLoginPassPage = googleLoginEmailPage.clickNextButton();

        googleLoginPassPage.enterPassword("Gabi1981ce#01");
        GoogleHomePage googleHomePage = googleLoginPassPage.clickNextButton();
    }

    @Ignore
    @Test
    public void checkEmail(){

    }

    @Ignore
    @Test
    public void someTest(){

    }

}
