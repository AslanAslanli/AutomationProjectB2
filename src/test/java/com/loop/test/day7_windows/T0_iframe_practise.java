package com.loop.test.day7_windows;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T0_iframe_practise extends TestBase {

    private void getPage(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
    }
    public void getFrame(String frameName){
        getPage();
        switch (frameName.toLowerCase()){
            case "right":
                driver.switchTo().frame("frame-top").switchTo().frame("frame-right");
                break;
            case "left":
                driver.switchTo().frame("frame-top").switchTo().frame("frame-left");
                break;
            case "middle":
                driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
                break;
            case "bottom":
                driver.switchTo().frame("frame-bottom");
                break;
            default:
                System.out.println("incorrect frame name");
                break;
        }
    }
    @Test
    public void check_Iframe_Texts () {
        List<String> list = new ArrayList<>(Arrays.asList("left", "right", "middle", "bottom"));
        for (String each : list) {
            getFrame(each);
            Assert.assertEquals(driver.findElement(By.tagName("body")).getText(), each.toUpperCase());
        }

        //driver.switchTo().frame
    }
}
