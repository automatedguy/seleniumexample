package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class GoogleSearchPage extends BasePage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[text()='Iniciar sesión']")
    private WebElement btnSignIn;

    @FindBy(how = How.XPATH, using = "//input[@name='q']")
    private WebElement inputSearch;

    @FindBy(how = How.XPATH, using = "(//input[@value='Buscar con Google'])[1]")
    private WebElement btnSearch;

    private String resultsLct = "//h3[@class='LC20lb']";

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public GoogleLoginEmailPage clickSignInButton(){
        click(this.btnSignIn);
        return PageFactory.initElements(driver, GoogleLoginEmailPage.class);
    }

    public void enterSearchText(String searchText){
        enterText(this.inputSearch, searchText);
    }

    public void clickSearchButton() {
        click(this.btnSearch);
    }

    public boolean isSearchFound(String searchPattern){
        List<WebElement> results = this.driver.findElements(By.xpath(resultsLct));
        setWebElementsList(results);
        return isMatchFound(searchPattern);
    }
}
