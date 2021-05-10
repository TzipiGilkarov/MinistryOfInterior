package WorkFlows;

import Extentions.UIActions;
import PageObjects.NamerApp.HomePage;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class WebFlows extends CommonOps
{
    @Step("check number of search results")
    public static void rsltNum() throws InterruptedException
    {
        UIActions.click(homePage.btn_findJob);
        UIActions.updateText(jobsPage.txt_searchArea,"מזכיר");
        UIActions.press_Enter(jobsPage.txt_searchArea);
        UIActions.click(jobsPage.srcImg);
    }

    @Step("mark a job as favorite")
    public static void fvrJob() throws InterruptedException
    {
        UIActions.click(homePage.btn_findJob);
        UIActions.click(jobsPage.results.get(1));
        UIActions.click(jobPage.btn_favorite);
        UIActions.nvg_back(driver);
        UIActions.click(jobsPage.fvr_icon);
    }

    @Step("filter by city אבו גוש")
    public static void filterByCIty() throws InterruptedException
    {
        UIActions.click(homePage.criterias.get(2));
        UIActions.click(homePage.option);
        UIActions.click(homePage.btn_findJob);
        Thread.sleep(2000);
    }


}
