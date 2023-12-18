package com.loop.test.day8_windowTables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTablesUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_webTables extends TestBase {

    /*
    1. login as an advisor
    2. go to users
    3. validate that full name for alex.de.souza@gmail.com is Alex De Souza
    4. validate that user name for alex.de.souza@gmail.com is alexdesouze
    5. validate that phone number for alex.de.souza@gmail.com is +994512060042
    6. validate that role for alex.de.souza@gmail.com is client
    7. validate that advisor for alex.de.souza@gmail.com is  Batch1 Group1
     */
    @Test
    public void userInfoValidation() throws InterruptedException {
        DocuportUtils.login(driver, "advisor");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement users = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
        users.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String expectedFullName = "Alex De Souza";
        String actualFullName = DocuportWebTablesUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Full name");
        Assert.assertEquals(actualFullName, expectedFullName);

        String expectedUserName = "alexdesouza";
        String actualUserName = DocuportWebTablesUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Username");
        Assert.assertEquals(actualUserName, expectedUserName);

        String expectedPhoneNumber = "+994512060042";
        String actualPhoneNumber = DocuportWebTablesUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Phone number (Extension)");
        Assert.assertEquals(actualPhoneNumber, expectedPhoneNumber);

        String expectedRole = "Client";
        String actualRole = DocuportWebTablesUtils.returnAnyField(driver, "alex.de.souza@gmail.com", "Role)");
        Assert.assertEquals(actualRole, expectedRole);

    }








}
