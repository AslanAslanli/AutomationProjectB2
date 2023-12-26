package com.loop.test.day9_config_driver;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class T1_Google_Search {
    @Test
    public void google_search(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId()) = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());;
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("Loop Academy" + Keys.ENTER);
        assertTrue(Driver.getDriver().getTitle().contains("Loop Academy"));
    }

    @Test
    public void docuport_search() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId()) = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());;
        DocuportUtils.login(Driver.getDriver(), "advisor");
        WebElement myUploads = Driver.getDriver().findElement(By.xpath("//span[.='My uploads']"));
        myUploads.click();
    }
}
