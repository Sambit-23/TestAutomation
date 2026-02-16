package com.demo;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.Retry;

//@Ignore
public class AppTest1
{
    @Test(groups = {"feature1"}, dataProvider = "dataProviderMethod", dataProviderClass = Data.class)
    public void test1(int a, int b, int c) throws InterruptedException {
        System.out.println("executing test1");
//        int sum = a+b;
//        Assert.assertEquals(sum,c);
//        Thread.sleep(2000);

    }

    @Test()
    public void test2(){
        System.out.println("executing test2");
//        SoftAssert a = new SoftAssert();
//        a.fail("failed deliberately");
//        a.assertAll();
    }
}
