package tests;

import base.BaseTest;
import base.SearchDataProvider;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.GoogleLoginEmailPage;

public class GoogleTests extends BaseTest {

    @Test(dataProvider = "searchPatternDataProvider", dataProviderClass = SearchDataProvider.class)
    public void searchNoLoginTest(String searchPattern){
        googleSearchPage.enterSearchText(searchPattern);
        googleSearchPage.clickSearchButton();
        Assert.assertTrue(googleSearchPage.isSearchFound(searchPattern));
    }

    @Test
    public void loginTest() {
        GoogleLoginEmailPage googleLoginEmailPage;
        googleLoginEmailPage = googleSearchPage.clickSignInButton();
        googleLoginEmailPage.enterEmail("automationthings@gmail.com");
        googleLoginEmailPage.clickNextButton();

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
