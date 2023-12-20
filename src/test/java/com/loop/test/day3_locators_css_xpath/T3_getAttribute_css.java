package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T3_getAttribute_css {
    @Test
    public void method() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://beta.docuport.app/");
//        driver.manage().window().fullscreen();
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

        WebElement docuport = driver.findElement(By.cssSelector("a>img[alt='Docuport']"));
        String valueOFAttribute = docuport.getAttribute("alt");
        System.out.println(valueOFAttribute);
        assertEquals(valueOFAttribute.trim(), "Docuport");

        Thread.sleep(3000);
        driver.quit();
    }
}
