package com.loop.test.day6_alerts_frames;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_alerts extends TestBase {

    @Test
    public void informationAlert(){
        driver.get("https://loopcamp.vercel.app/checkboxes.html");
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.findElement(By.xpath("//input[@name='checkbox2']")).isSelected());

        driver.switchTo().alert().sendKeys("");
    }

}
