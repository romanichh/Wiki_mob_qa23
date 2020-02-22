package com.elena.wiki;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestOpenWiki {
  AppiumDriver driver;
  @BeforeClass
  public void setUp() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "qa22_home");
    capabilities.setCapability( "platformVersion", "8.0");
    capabilities.setCapability("automationName", "Appium");
    capabilities.setCapability( "appPackage", "org.wikipedia");
    capabilities.setCapability("appActivity",".main.MainActivity");
    capabilities.setCapability("app",
            "C:\\Users\\Elena\\Dropbox\\Tel-ran\\Mobile\\apk\\org.wikipedia.apk");

    driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


  }

@Test
  public void testOpenW(){
  System.out.println("App opened");
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
    Thread.sleep(5000);
driver.quit();
  }
}
