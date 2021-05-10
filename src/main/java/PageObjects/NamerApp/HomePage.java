package PageObjects.NamerApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage
{
    @FindBy(how = How.XPATH, using = "//button[@class='search']")
    public WebElement btn_findJob;



    @FindBy(how = How.XPATH, using = "/html/body/app-root/div[2]/app-new-home/div/div[1]/div/app-new-job-search/div/div/div[2]/div[3]/div/app-filter/app-filterlist/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]")
    public WebElement option;

    @FindBy(how = How.XPATH, using = "//span[@class='ng-star-inserted']")
    public List<WebElement> criterias;


}
