package com.loop.test.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.*;

public class LoopCampUtils {
    public static String return_A_Field (WebDriver driver, String name, String fieldName){

        Map <String, String> map = new LinkedHashMap<>();
        List<String> fieldList = new ArrayList<>();
        List<String> xPathList = new ArrayList<>();

        for (int i = 1, j = 3, k=0; i <= 10 ; i++, j++, k++) {
            fieldList.add(driver.findElement(By.xpath("//tr//th[" + j + "]")).getText());
            xPathList.add(driver.findElement(By.xpath("//td[2][text()='" + name +"']" + "/following-sibling::td[" + i + "]")).getText());
            map.put(fieldList.get(k), xPathList.get(k));
        }

        return map.get(fieldName);
    }
    public static List<String> return_AllFields (WebDriver driver, String name){
        List<String> actualValues = new ArrayList<>();

        for (int i = 1; i <= 10 ; i++)
            actualValues.add(driver.findElement(By.xpath("//td[2][text()='" + name +"']" + "/following-sibling::td[" + i + "]")).getText().trim());

        return actualValues;
    }
}
