package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class T1_locators_getText {
    @Test
    public void method() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app/login");

        WebElement inputUsername = driver.findElement(By.id("input-14"));
        inputUsername.sendKeys(DocuportConstants.USERNAME_CLIENT);

//        WebElement inputPassword = driver.findElement(By.id("input-15"));
//        inputPassword.sendKeys(DocuportConstants.GENERIC_PASSWORD);

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessage.getText();
        assertEquals(actualErrorMessage, DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD);

        Thread.sleep(3000);
        driver.quit();






    }
}
