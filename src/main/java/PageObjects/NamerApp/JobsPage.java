package PageObjects.NamerApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class JobsPage
{
    @FindBy(how = How.XPATH, using = "//input[@id='mat-input-0']")
    public WebElement txt_searchArea;

//   @FindBy(how = How.XPATH, using = "//img[@class='vimage']")
//   public List<WebElement> results;



    @FindBy(how = How.XPATH, using = "//img[@src='../../../../assets/img/Search.png']")
    public WebElement srcImg;

    @FindBy(how = How.XPATH, using = "//span[@class='favorite-icon']")
    public WebElement fvr_icon;

    @FindBy(how = How.XPATH, using = "//tbody//tr[@class='mobiletr rowGetHover mat-row ng-star-inserted']")
    public List<WebElement> results;



    @FindBy(how = How.XPATH, using = "//p[@class='noresults']")
    public WebElement noJobsFnd;

}
