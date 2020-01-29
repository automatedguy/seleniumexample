package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleLoginEmailPage extends BasePage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@type='email']")
    private WebElement inputEmail;

    @FindBy(how = How.XPATH, using = "//div[@id='identifierNext']")
    private WebElement btnNext;

    public GoogleLoginEmailPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void enterEmail(String emailAddress){
        enterText(this.inputEmail, emailAddress);
    }

    public GoogleLoginPassPage clickNextButton() {
        click(this.btnNext);
        return PageFactory.initElements(driver, GoogleLoginPassPage.class);
    }
}
