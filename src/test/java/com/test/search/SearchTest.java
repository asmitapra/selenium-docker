package com.test.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import tests.BaseTest;

public class SearchTest extends BaseTest {


    @Test
    public void search()
    {
        SearchPage search = new SearchPage(driver);
        search.goTo();
        search.doSearch("java");
        search.goToVideos();
        search.printResult();
    }


}
