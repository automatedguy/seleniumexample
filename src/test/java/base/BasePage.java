package base;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BasePage {

    WebDriver driver;
    private List<WebElement> webElementsList;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void setWebElementsList(List<WebElement> webElementsList) {
        this.webElementsList = webElementsList;
    }


    protected void click(WebElement webElement){
        System.out.println("Clicking on button.");
        int attempt = 0;
        boolean clicked = false;

        do {
            try {
                webElement.click();
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

    protected void enterText(WebElement webElement, String text){
        System.out.println("Entering text:" + text);
        webElement.sendKeys(text);
    }


    protected boolean isMatchFound(String searchPattern){
        for(WebElement element : this.webElementsList){
            if(element.getText().contains(searchPattern)){
                return true;
            }
        }
        return false;
    }
}
