import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchPage {

    public GoogleSearchPage() {
            this.inputSearch = ;
    }

    private WebElement inputSearch;
    private WebElement btnSearch;
    private List<WebElement> results;

    public void enterSearchText(String searchText){
        this.inputSearch.sendKeys(searchText);
    }

    public void clickSearchButton(){
        this.btnSearch.click();
    }
}
