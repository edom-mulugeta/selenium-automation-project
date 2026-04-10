package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupTest extends BaseTest {

    @Test
    public void testSignup() {
        driver.get("https://demoqa.com/text-box");

        SignupPage signup = new SignupPage(driver);
        signup.enterName("Edom");
        signup.enterEmail("edom@test.com");
        signup.enterAddress("Maryland");
        signup.clickSubmit();

        System.out.println("Signup test executed successfully");
    }
}