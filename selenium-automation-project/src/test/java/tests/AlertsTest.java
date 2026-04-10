package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertsTest extends BaseTest {

    @Test
    public void testAlert() {

        driver.get("https://demoqa.com/alerts");

        AlertsPage alertsPage = new AlertsPage(driver);

        alertsPage.removeAds();
        alertsPage.clickAlertButton();

        String text = alertsPage.getAlertText();
        Assert.assertEquals(text, "You clicked a button");

        alertsPage.acceptAlert();

        System.out.println("Alert test passed");
    }
}