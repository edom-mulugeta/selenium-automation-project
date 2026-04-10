package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupNegativeTest extends BaseTest {

    @Test
    public void testSignupWithoutName() {
        driver.get("https://demoqa.com/text-box");

        SignupPage signup = new SignupPage(driver);
        signup.enterEmail("edom@test.com");
        signup.enterAddress("Maryland");
        signup.clickSubmit();

        System.out.println("Negative signup test executed successfully");
    }
}