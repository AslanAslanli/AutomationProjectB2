package com.loop.test.utilities;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class DocuportUtils extends TestBase {
    static WebDriver driver;
    /**
     * logins to the docuport application
     * @param driver, which intializes in testbase
     * @param role, comes from docuport constants
     */


    public static void login(WebDriver driver, String role) throws InterruptedException {
        //driver.get("https://beta.docuport.app/");
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement username = Driver.getDriver().findElement(By.xpath("//label[.='Username or email']//following-sibling::input"));
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        WebElement loginBUtton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        switch (role.toLowerCase()){
            case "client":
                username.sendKeys(DocuportConstants.USERNAME_CLIENT);
                password.sendKeys(DocuportConstants.GENERIC_PASSWORD);
                break;
            case "supervisor":
                username.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
                password.sendKeys(DocuportConstants.GENERIC_PASSWORD);
                break;
            case "advisor":
                username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
                password.sendKeys(DocuportConstants.GENERIC_PASSWORD);
                break;
            case "employee":
                username.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
                password.sendKeys(DocuportConstants.GENERIC_PASSWORD);
                break;
            default: throw new InputMismatchException("There us not such a role: " + role);
        }

        loginBUtton.click();

        if(role.toLowerCase().equals("client")){
            Thread.sleep(3000);
            WebElement cont = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
            cont.click();
        }
    }

    public static void logOut(WebDriver driver){
        WebElement userIcon = Driver.getDriver().findElement(By.xpath("//div[@class='v-avatar primary']"));
        userIcon.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement logOut = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Log out')]"));
        logOut.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

}

