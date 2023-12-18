package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Locators {
    @Test
    public void method() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));

        WebElement haqqindaLink = driver.findElement(By.linkText("Google Haqqında"));
        haqqindaLink.click();
        driver.navigate().back();

        searchBoxWithName.sendKeys("Ujuju");
        searchBoxWithID.clear();
        String textToSearch = "Loop Academy";
        searchBoxWithID.sendKeys(textToSearch, Keys.ENTER);

        assertTrue(driver.getTitle().contains(textToSearch));

        Thread.sleep(2000);

        //System.out.println(driver.findElement(By.tagName("title")).getText());
        driver.quit();
    }
}
