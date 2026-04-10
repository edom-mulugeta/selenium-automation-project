package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckboxClick() {
        driver.get("https://demoqa.com/checkbox");

        CheckboxPage checkbox = new CheckboxPage(driver);

        checkbox.removeAds();
        checkbox.clickHomeCheckbox();

        Assert.assertTrue(checkbox.isHomeSelected(), "Home checkbox was not selected");

        System.out.println("Checkbox test passed");
    }
}