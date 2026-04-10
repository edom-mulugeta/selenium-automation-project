package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginPageLoads() {

        driver.get("https://demoqa.com/login");

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains("login"));

        System.out.println("Login page loaded successfully");
    }
}