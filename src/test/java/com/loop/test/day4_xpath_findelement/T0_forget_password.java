package com.loop.test.day4_xpath_findelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T0_forget_password {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://beta.docuport.app/");

        //WebElement forgetPasswordLink = driver.findElement(By.linkText("Forgot password?"));
        WebElement forgetPasswordLink = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
        WebElement forgetPasswordLink1 = driver.findElement(By.xpath("//a[.='Forgot password?']"));

        WebElement forgetPasswordLink2 = driver.findElement(By.xpath("//div[@class=\"text-right\"]"));
        System.out.println("forgetPasswordLink2.getText() = " + forgetPasswordLink2.getText());

        System.out.println(forgetPasswordLink.getAttribute("href"));
        forgetPasswordLink.click();

        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div>h1"));
        System.out.println(forgetPasswordHeading.getText());

        driver.quit();
    }
}
