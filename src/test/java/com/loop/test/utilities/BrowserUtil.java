package com.loop.test.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class BrowserUtil {

    /**
     * validate if driver switched to expected url and title
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author Aslan
     * implements assertion
     *
     */

    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle){
        expectedTitle = expectedTitle.toLowerCase();
        expectedUrl = expectedUrl.toLowerCase();
        Set<String> windowHandles = driver.getWindowHandles();

        for (String eachWindow : windowHandles) {
            driver.switchTo().window(eachWindow);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }
        }
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    /**
     * @param driver
     */

    public static void switchToWindow(WebDriver driver, String targetTitle){
        String origin = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);

            if (driver.getTitle().toLowerCase().contains(targetTitle))
                break;
        }

        if (!driver.getTitle().contains(targetTitle))
            driver.switchTo().window(origin);
    }

}
