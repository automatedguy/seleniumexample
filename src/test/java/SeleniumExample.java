import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumExample {


    public static void main(String[] args){

        WebDriver webDriver;
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        webDriver = new ChromeDriver(chromeOptions);

        webDriver.navigate().to("https://www.google.com");
        webDriver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium webdriver");
        webDriver.findElement(By.xpath("(//input[@value='Buscar con Google'])[1]")).click();
        for(WebElement webElement: webDriver.findElements(By.xpath("//h3[@class='LC20lb']"))){
            webElement.getText().contains("Selenium webdriver");
        }


        webDriver.quit();

    }
}
