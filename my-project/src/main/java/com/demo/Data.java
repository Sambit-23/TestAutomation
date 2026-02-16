package com.demo;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(parallel = true)
    public static Object[][] dataProviderMethod(){
        return new Object[][]{
                {1,2,3},
                {4,5,9},
                {9,0,9},
                {2,5,7},
                {5,6,11}
        };
    }
}
