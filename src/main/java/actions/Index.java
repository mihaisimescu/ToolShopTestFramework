package action;

import org.openqa.selenium.WebDriver;
import webelements.IndexElements;

public class Index {

    private IndexElements element;

    public Index(WebDriver driver) {
        this.element = new IndexElements(driver);
    }

    public String getPageTitle(){
        return element.pageTitle().getText();
    }
}
