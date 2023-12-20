package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.LoopCampConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T2_getText_getAttribute {
    @Test
    public void method() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement actualHeaderText = driver.findElement(By.tagName("h2"));
        assertEquals(actualHeaderText.getText(), LoopCampConstants.EXPECTED_HEADER_FOR_FORM);

        WebElement usernamePlaceHolder = driver.findElement(By.name("username"));
        String actualPlaceHolderForUsername = usernamePlaceHolder.getAttribute("placeholder");
        assertEquals(actualPlaceHolderForUsername, LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME);


        Thread.sleep(3000);
        driver.quit();
    }
}
