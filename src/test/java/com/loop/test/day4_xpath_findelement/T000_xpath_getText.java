package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class T000_xpath_getText {
    WebDriver driver;
    public void getPage(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app/");
    }

    @Test
    public void method() throws InterruptedException {
        getPage();
        WebElement element = driver.findElement(By.xpath("//a[@href='/reset-password']"));
        element.click();

        assertTrue(driver.getCurrentUrl().contains("reset-password"));
        WebElement placeholderMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String expected = "Enter the email address associated with your account";
        assertEquals(placeholderMessage.getText(), expected);

        WebElement emailInput = driver.findElement(By.xpath("//input[contains(@id, 'input')]"));
        emailInput.sendKeys("forgotpasswordg1@gmail.com");

        WebElement cancelButton = driver.findElement(By.xpath("//span[normalize-space()='Cancel']"));
        //WebElement cancelButton = driver.findElement(By.xpath("//span[.= ' Cancel ']"));
        assertTrue(cancelButton.isDisplayed());

        WebElement sendButton = driver.findElement(By.xpath("//span[.=' Send ']"));
        assertTrue(sendButton.isDisplayed());
        sendButton.click();

        Thread.sleep(3000);
        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));
        //Thread.sleep(3000);
        System.out.println(successMessage.getText());


    }
}
