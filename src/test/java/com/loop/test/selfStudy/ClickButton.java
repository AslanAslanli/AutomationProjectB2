//package com.loop.test.selfStudy;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class ClickButton {
//
//    package com.loop.day1_selenium_intro;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//    public class Practice1_Docuport {
//        public static void main(String[] args) {
//            SafeData safeData = new SafeData();
//            // WebDriverManager.chromedriver().setup();
//            // WebDriver driver = new ChromeDriver();
//            WebDriver driver = WebDriverManager.chromedriver().create();
//
//            driver.get("https://beta.docuport.app/login");
//
//            // Find the email input field and enter the username
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//            WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-14")));
//            emailInput.sendKeys(safeData.getUsername());
//
//            // Find the password input field and enter the password
//            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-15")));
//            passwordInput.sendKeys(safeData.getPassword());
//
//            // Find and click the "Log On" button for the password
//            WebElement logOnButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("v-btn__content")));
//            logOnButton.click();
//
//            // Close the browser
//            //driver.quit();
//        }
//}
