import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static void main(String[] args){

        /*TODO: Implement Base Test and move this code  */
        WebDriver driver;
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.google.com");
        String searchPattern = "CNN";

        /* TODO: Implement Base Page and move generic methods there  */
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.enterSearchText(searchPattern);
        googleSearchPage.clickSearchButton();
        googleSearchPage.isMatchFound(searchPattern);
        Assert.assertTrue(googleSearchPage.isMatchFound(searchPattern));


        /*TODO: Implement Base Test and move this code  */
        driver.quit();
    }
}
