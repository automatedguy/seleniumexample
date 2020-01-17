import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage {

    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
            this.driver = driver;
            this.inputSearch = driver.findElement(By.xpath("//input[@name='q']"));
            this.btnSearch = driver.findElement(By.xpath("(//input[@value='Buscar con Google'])[1]"));
    }

    private WebElement inputSearch;
    private WebElement btnSearch;
    private List<WebElement> results;

    public void enterSearchText(String searchText){
        this.inputSearch.sendKeys(searchText);
    }

    public void clickSearchButton() {
        int attempt = 0;
        boolean clicked = false;

        do {
            try {
                this.btnSearch.click();
                clicked = true;
            } catch (ElementNotInteractableException e) {
                attempt++;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (attempt < 3 && !clicked);
    }

    public boolean isMatchFound(String searchPattern){

        this.results = this.driver.findElements(By.xpath("//h3[@class='LC20lb']"));

        for(WebElement result : results){

            if(result.getText().contains(searchPattern)){
                return true;
            }
        }
        return false;
    }
}
