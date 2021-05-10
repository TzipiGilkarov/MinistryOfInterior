package SanityTests;

import Extentions.UIActions;
import Extentions.Verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NamerApp extends CommonOps
{
    @Test (description = "Validate search result's number", priority =1)
    @Description("Validate search result's number to the word 'מזכיר'")
    public static void test01_searchResults() throws InterruptedException
    {
        WebFlows.rsltNum();
        Verifications.numberOfElements(jobsPage.results,2);
    }

    @Test (description = "Validate favorites area", priority =2)
    @Description("mark a job as favorite and validate it appears in favorites area")
    public static void test02_favorite() throws InterruptedException
    {
        WebFlows.fvrJob();

    }

    @Test (description = "Validate that no jobs to this criteria", priority =3)
    @Description("filter jobs by city אבו גוש and validate that no jobs to this criteria")
    public static void test03_filterByCity() throws InterruptedException
    {
        WebFlows.filterByCIty();
        Verifications.text(jobsPage.noJobsFnd.getText(), "לא נמצאו מכרזים העונים על הגדרות החיפוש שהזנת,\n" +
                " נסה להרחיב את הגדרות החיפוש");
    }
}
