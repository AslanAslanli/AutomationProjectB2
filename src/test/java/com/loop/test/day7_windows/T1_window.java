package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_window extends TestBase {

    public void getPage(){
        driver.get("http://the-internet.herokuapp.com/windows");
    }

    @Test
    public void test_window_handle(){
        getPage();
        Assert.assertEquals(driver.getTitle(), "The Internet", "Results aren't matching!");

        //System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        //System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            System.out.println("each windows handle: " + each);
            driver.switchTo().window(each);
        }

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());

        WebElement newWindow = driver.findElement(By.tagName("h3"));
        System.out.println("newWindow = " + newWindow.getText());
    }

    /*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */
}
