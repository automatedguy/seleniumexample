package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static base.Constants.*;

public class BaseTest {

    public WebDriver driver;
    ChromeOptions chromeOptions = new ChromeOptions();

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", RESOURCES_PATH + CHROMEDRIVER);
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @BeforeMethod
    public void navigateToBaseUrl(){
        driver.navigate().to(BASE_URL);
    }
}
