package com.loop.test.day8_windowTables_config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fhf {
    public static void main(String[] args) {

        String str = "Den is Java King";
        List<String> list = convertToList(str);
        System.out.println(list);

    }

    public static List<String> convertToList (String str) {
        return new ArrayList<>(Arrays.asList(str.split(" ")));
    }
}
