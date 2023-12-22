package com.loop.test.day9_config_driver;

import org.testng.annotations.Test;

public class T000_singleton_practice {
    @Test
    public void practise(){
        String str1 = T00_Singleton_pattern_example.getWord();
        System.out.println("str1 = " + str1);

        System.out.println("======================");
        String str2 = T00_Singleton_pattern_example.getWord();
        System.out.println(str2);
    }
}
