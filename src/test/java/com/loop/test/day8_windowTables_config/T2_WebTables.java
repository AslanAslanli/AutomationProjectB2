package com.loop.test.day8_windowTables_config;
import com.loop.test.base.TestBase;
import com.loop.test.utilities.LoopCampUtils;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class T2_WebTables extends TestBase {
    @Test
    public void loopCampWebTables_Test() {
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        T2_Test_Data.TEST_NAMES.forEach(eachName -> assertEquals(LoopCampUtils.return_AllFields(driver, eachName), (T2_Test_Data.EXPECTED_VALUES.get(eachName))));
    }
}
