package Utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    public static void init()
    {
        homePage = PageFactory.initElements(driver, PageObjects.NamerApp.HomePage.class);
        jobsPage= PageFactory.initElements(driver, PageObjects.NamerApp.JobsPage.class);
        jobPage=PageFactory.initElements(driver, PageObjects.NamerApp.JobPage.class);
    }
}
