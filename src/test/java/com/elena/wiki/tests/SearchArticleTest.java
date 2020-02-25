package com.elena.wiki.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchArticleTest extends  TestBase {
  @Test
  public void testSearchArticle(){
    app.getArticle().initSearchArticle();
    app.getArticle().typeRequest("Appium");

    Assert.assertTrue(app.getArticle().isThereResult());
   // app.getArticle().getList();


  }
}
