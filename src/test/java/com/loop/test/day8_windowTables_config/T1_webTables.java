package com.loop.test.day8_windowTables_config;
import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportUtils;
import com.loop.test.utilities.DocuportWebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.assertEquals;
public class T1_webTables extends TestBase {
    private static final By usersTab = By.xpath("//span[.='Users']");
    public void getPage() throws InterruptedException {
        DocuportUtils.login(driver, "advisor");
        wait(5);
    }
    @Test
    public void test_webTables() throws InterruptedException {
        getPage();
        driver.findElement(usersTab).getText();
        wait(5);

        // putting table Headers into a sinlge list for an easier call of returnAnyField function later in the for loop
        List<String> tableHeaders = new ArrayList<>();
        List<WebElement> fieldsList = driver.findElements(By.xpath("//th[@role='columnheader']"));
        fieldsList.forEach(each -> {if (!each.getText().isEmpty() && !each.getText().equals("Email address")) tableHeaders.add(each.getText().trim());});

        // list of expected values for alex.de.souza.gmail.com
        List<String> expectedValues = new ArrayList<>(Arrays.asList("Alex De Souza", "alexdesouze", "", "+994512060042", "Client", "Batch1 Group1"));

        // assertions loop for expected values VS actual values
        for (int i = 0; i < tableHeaders.size(); i++)
            assertEquals(expectedValues.get(i), DocuportWebTableUtils.returnAnyField(driver, "alex.de.souza@gmail.com", tableHeaders.get(i)));
    }
}
