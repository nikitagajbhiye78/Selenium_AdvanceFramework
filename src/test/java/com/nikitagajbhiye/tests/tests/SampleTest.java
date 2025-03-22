package com.nikitagajbhiye.tests.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    // just for dry test
    @Description("Tc1")
    @Test
    public void login_one (){
        Assert.assertTrue(true);
    }

    @Description("Tc2")
    @Test
    public void login_two(){
        Assert.assertTrue(true);
    }
}
