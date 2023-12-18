package com.loop.test.day3_locators_css_xpath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class GoogleSearch {

    @Test
    public void method(){
        //setup the driver
        WebDriverManager.chromedriver().setup();

        //create the driver
        WebDriver driver = new ChromeDriver();
        //WebDriver driver1 = WebDriverManager.chromedriver().create();

        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com");
        //driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.contains(expectedTitle));

        String expectedURL = "https://www.google.com";
        String actualURL = driver.getCurrentUrl();
        assertTrue(actualURL.contains(expectedURL));

        driver.quit();
    }
}
