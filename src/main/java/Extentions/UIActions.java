package Extentions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class UIActions  extends CommonOps
{
    @Step("Click on element")
    public static void click(WebElement elem)
    {
       // wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step("send text to element")
    public static void updateText(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }
    @Step("update Drop Down")
    public static void updateDropDown(WebElement elem, String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue=new Select(elem);
        myValue.selectByVisibleText(value);
    }
    @Step("mouse hover to elements")
    public static void mouseHoverElements(WebElement elem1,WebElement elem2)
    {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }

    @Step("mouse hover to element")
    public static void mouseHoverElement(WebElement elem)
    {
        action.moveToElement(elem).click().build().perform();
    }



    @Step("handle IFrame")
    public static void handle_IFrame(WebElement elem)
    {
        driver.switchTo().frame(elem);

    }
    @Step("press Enter")
    public static void press_Enter(WebElement elem)
    {
        elem.sendKeys(Keys.RETURN);
    }
    @Step("go back to the previous browser page")
    public static void nvg_back(WebDriver driver)
    {
        driver.navigate().back();
    }



}


