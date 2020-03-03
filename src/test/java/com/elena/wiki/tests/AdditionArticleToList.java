package com.elena.wiki.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionArticleToList extends TestBase {

    @Test
    public void addArticle() throws InterruptedException {
        app.skipWelcomePage();
        app.getArticle().initSearchArticle();
        app.getArticle().typeRequest("Java");
        app.getArticle().addToList();
        Assert.assertTrue(app.getArticle().isArticlePresent());

    }

}
