package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;

public class GoogleTests extends BaseTest {


    @Test
    public void searchNoLoginTest(){
        String searchPattern = "CNN";
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

        googleSearchPage.enterSearchText(searchPattern);
        googleSearchPage.clickSearchButton();
        googleSearchPage.isMatchFound(searchPattern);
        Assert.assertTrue(googleSearchPage.isSearchFound(searchPattern));

    }

    @Test
    public void anotherSearchNoLoginTest(){
        String searchPattern = "ABC";
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

        googleSearchPage.enterSearchText(searchPattern);
        googleSearchPage.clickSearchButton();
        googleSearchPage.isMatchFound(searchPattern);
        Assert.assertTrue(googleSearchPage.isSearchFound(searchPattern));
    }
}
