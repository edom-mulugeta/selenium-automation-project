package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;

    private By alertButton = By.id("alertButton");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void removeAds() {
        ((JavascriptExecutor) driver).executeScript(
            "document.querySelectorAll('iframe, #fixedban, .advertisement').forEach(el => el.remove());"
        );
    }

    public void clickAlertButton() {
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].click();",
            driver.findElement(alertButton)
        );
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}