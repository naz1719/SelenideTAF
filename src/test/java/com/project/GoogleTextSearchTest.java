package com.project;

import com.project.po.GooglePage;
import com.project.po.SearchResultsPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTextSearchTest {

    @Test
    public void userCanSearch() {
        open("https://google.com/ncr");
        new GooglePage().searchFor("selenide");

        SearchResultsPage results = new SearchResultsPage();
        results.checkResultsSizeIsAtLeast(1);
        results.checkResultHasTest(0, "Selenide: concise UI tests in Java");
    }
}
