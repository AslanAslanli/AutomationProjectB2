package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.BrowserUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class T2_windows extends TestBase {

    @Test
    public void windowHandleTest() throws InterruptedException {
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        BrowserUtil.switchWindowAndValidate(driver, "amazon.com", "amazon");
//        Set<String> windowHandles = driver.getWindowHandles();
//
//        for (String eachWindow : windowHandles) {
//            driver.switchTo().window(eachWindow);
//
//            if (driver.getCurrentUrl().toLowerCase().contains("etsy"))
//                break;
//        }
        BrowserUtil.switchToWindow(driver, "facebook");
        Thread.sleep(3000);
    }



}
