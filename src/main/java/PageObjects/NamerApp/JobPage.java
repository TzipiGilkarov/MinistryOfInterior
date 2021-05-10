package PageObjects.NamerApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JobPage
{
    @FindBy(how = How.XPATH, using = "//button[@class='favorits']")
    public WebElement btn_favorite;
}
