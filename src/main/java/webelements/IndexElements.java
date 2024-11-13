package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexElements {

    private WebDriver driver = null;

    public IndexElements(WebDriver driver){
        this.driver = driver;
    }

    public WebElement pageTitle(){
        return driver.findElement(By.cssSelector("a[class ='navbar-brand']"));
    }
}
