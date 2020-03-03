package com.elena.wiki.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticleHelper extends HelperBase {

    public ArticleHelper(AppiumDriver driver) {
        super(driver);
    }

    public void initSearchArticle() {
        tap(By.id("search_container"));
    }

    public void typeRequest(String text) {
        type(By.id("search_src_text"), text);
    }

    public void getList() {
    }

    public boolean isThereResult(int timeout) {
        new WebDriverWait(driver, timeout).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']")));
        return isElementPresent(By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']"));
    }

    public void swipeArticlesUp() {
        driver.hideKeyboard();
        swipeUp();
    }

    public void addToList() throws InterruptedException {
        selectArticle();
        additionButton();
        confirmAddition();
        savedList();
        viewList();

    }

    private void viewList() throws InterruptedException {
        tap(By.xpath("//*[@resource-id='org.wikipedia:id/snackbar_action']"));
        pause(5000);
    }

    private void savedList() {
        tap(By.xpath("//*[@resource-id='org.wikipedia:id/item_image_2']"));
    }

    private void confirmAddition() {
        tap(By.xpath("//android.widget.TextView[@resource-id='org.wikipedia:id/onboarding_button']"));

    }

    private void additionButton() throws InterruptedException {
        tap(By.xpath("//*[@resource-id='org.wikipedia:id/article_menu_bookmark']"));
        pause(4000);
    }

    private void selectArticle() throws InterruptedException {
        tap(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_image']"));
        pause(4000);
    }

    public boolean isArticlePresent() {
        return isElementPresent(By.xpath("//*[@resource-id='org.wikipedia:id/page_list_item_image']"));
    }
}
