package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imageDiff=new ImageDiffer();
    public static ImageDiff diff;

    public static PageObjects.NamerApp.HomePage homePage;
    public static PageObjects.NamerApp.JobsPage jobsPage;
    public static PageObjects.NamerApp.JobPage jobPage;
}
