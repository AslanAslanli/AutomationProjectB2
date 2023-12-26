package com.loop.test.base;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;
    public void wait(int seconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }





}
