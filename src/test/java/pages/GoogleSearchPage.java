package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage extends BasePage {

    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
        this.inputSearch = driver.findElement(By.xpath("//input[@name='q']"));
        this.btnSearch = driver.findElement(By.xpath("(//input[@value='Buscar con Google'])[1]"));
    }

    private WebElement inputSearch;
    private WebElement btnSearch;
    private List<WebElement> results;

    public void enterSearchText(String searchText){
        setWebElement(this.inputSearch);
        enterText(searchText);
    }

    public void clickSearchButton() {
        setWebElement(this.btnSearch);
        click();
    }

    public boolean isSearchFound(String searchPattern){
        results = this.driver.findElements(By.xpath("//h3[@class='LC20lb']"));
        setWebElementsList(results);
        return isMatchFound(searchPattern);
    }
}
