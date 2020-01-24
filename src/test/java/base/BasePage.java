package base;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    // TODO: Make class abstract change to methods to protected.

    WebDriver driver;
    private WebElement webElement;
    private List<WebElement> webElementsList;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }

    protected void setWebElementsList(List<WebElement> webElementsList) {
        this.webElementsList = webElementsList;
    }


    public void click(){
        System.out.println("Clicking on button.");
        int attempt = 0;
        boolean clicked = false;

        do {
            try {
                this.webElement.click();
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

    public void enterText(String text){
        System.out.println("Entering text:" + text);
        this.webElement.sendKeys(text);
    }


    public boolean isMatchFound(String searchPattern){
        for(WebElement element : this.webElementsList){
            if(element.getText().contains(searchPattern)){
                return true;
            }
        }
        return false;
    }
}
