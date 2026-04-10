package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    private WebDriver driver;

    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By submitBtn = By.id("submit");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        driver.findElement(fullName).sendKeys(name);
    }

    public void enterEmail(String emailText) {
        driver.findElement(email).sendKeys(emailText);
    }

    public void enterAddress(String address) {
        driver.findElement(currentAddress).sendKeys(address);
    }

    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }
}