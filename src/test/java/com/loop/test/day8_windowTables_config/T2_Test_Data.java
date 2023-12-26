package com.loop.test.day8_windowTables_config;
import java.util.*;
public class T2_Test_Data {
    public static final List<String> TEST_NAMES = new ArrayList<>(Arrays.asList("Alexandra Gray", "John Doe", "Stewart Dawidson", "Bart Fisher"));
    public static final Map<String, List<String>> EXPECTED_VALUES = new LinkedHashMap<>();
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final List<String> EXPECTED_ALEXANDRA = new ArrayList<>(Arrays.asList("Thin Crust", "2", "04/15/2021", "7, Miller Street", "Chicago, IL", "US", "748", "VISA", "321456789012", "02/24"));
    public static final List<String> EXPECTED_JOHN = new ArrayList<>(Arrays.asList("Pepperoni", "3", "01/08/2021", "12, Cherry Ave", "Arlington, VA", "Canada", "76743", "MasterCard", "980077987700", "01/23"));
    public static final List<String> EXPECTED_STEWART = new ArrayList<>(Arrays.asList("Sausage", "4", "03/29/2021", "19, Victor Ave", "Cate Island", "Canada", "24232", "VISA", "774555444555", "03/23"));
    public static final List<String> EXPECTED_BART = new ArrayList<>(Arrays.asList("Cheese", "3", "01/16/2021", "35, Rock st.", "McLean, VA", "US", "22043", "American Express", "444222333666", "07/26"));

    static  {
        EXPECTED_VALUES.put("Alexandra Gray", EXPECTED_ALEXANDRA);
        EXPECTED_VALUES.put("John Doe", EXPECTED_JOHN);
        EXPECTED_VALUES.put("Stewart Dawidson", EXPECTED_STEWART);
        EXPECTED_VALUES.put("Bart Fisher", EXPECTED_BART);
    }


}
