package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchPage extends BasePage {

    private WebDriver driver;

    private String btnSignInLct = "//a[text()='Iniciar sesión']";
    private String inputSearchLct = "//input[@name='q']";
    private WebElement inputSearch;
    private String btnSearchLct = "(//input[@value='Buscar con Google'])[1]";
    private WebElement btnSearch;
    private String resultsLct = "//h3[@class='LC20lb']";

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.inputSearch = driver.findElement(By.xpath(inputSearchLct));
        this.btnSearch = driver.findElement(By.xpath(btnSearchLct));
    }

    public GoogleLoginEmailPage clickSignInButton(){
        WebElement btnSignIn = this.driver.findElement(By.xpath(btnSignInLct));
        setWebElement(btnSignIn);
        click();
        return new GoogleLoginEmailPage(this.driver);
    }

    public void enterSearchText(String searchText){
        setWebElement(this.inputSearch);
        enterText(searchText);
    }

    public void clickSearchButton() {
        setWebElement(this.btnSearch);
        click();
    }

    public boolean isSearchFound(String searchPattern){
        List<WebElement> results = this.driver.findElements(By.xpath(resultsLct));
        setWebElementsList(results);
        return isMatchFound(searchPattern);
    }
}
