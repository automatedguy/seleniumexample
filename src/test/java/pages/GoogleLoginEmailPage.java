package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLoginEmailPage extends BasePage {

    WebDriver driver;

    private String inputEmailLct = "//input[@type='email']";
    private WebElement inputEmail;
    private String btnNextLct = "//div[@id='identifierNext']";
    private WebElement btnNext;

    public GoogleLoginEmailPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.inputEmail = driver.findElement(By.xpath(inputEmailLct));
        this.btnNext = driver.findElement(By.xpath(btnNextLct));

    }

    public void clickNextButton() {
        setWebElement(this.btnNext);
        click();
    }

    public void enterEmail(String emailAddress){
        setWebElement(inputEmail);
        enterText(emailAddress);
    }
}
