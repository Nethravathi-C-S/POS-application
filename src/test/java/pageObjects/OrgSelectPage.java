package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgSelectPage extends BasePage{
    public OrgSelectPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[1]/div/div[3]/div[2]/div[1]/div/div")
        WebElement SelectLoc;

       public void clickLoc() {SelectLoc.click();
    }
}
