package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T1_findElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.nba.com/");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
//        for (WebElement eachElement : list) {
//           if (!eachElement.getText().isEmpty())
//               System.out.println(eachElement.getText() + ": \n" + eachElement.getAttribute("href"));
//        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getText().isEmpty()) {
                System.out.println("list.get(i).getText() = " + list.get(i).getText());
                System.out.println("list.get(i).getAttribute(\"href\") = " + list.get(i).getAttribute("href"));
            }
        }
        driver.quit();
    }
}
