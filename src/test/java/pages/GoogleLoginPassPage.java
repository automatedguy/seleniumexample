package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleLoginPassPage extends BasePage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement inputPass;

    @FindBy(how = How.XPATH, using = "//div[@id='passwordNext']")
    private WebElement btnNext;

    public GoogleLoginPassPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public GoogleHomePage clickNextButton() {
        click(this.btnNext);
        return PageFactory.initElements(driver, GoogleHomePage.class);
    }

    public void enterPassword(String emailPassword){
        enterText(this.inputPass, emailPassword);
    }
}
