package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckboxPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By homeText = By.xpath("//span[@class='rct-title' and text()='Home']");
    private By checkedIcon = By.cssSelector("svg.rct-icon.rct-icon-check");

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void removeAds() {
        ((JavascriptExecutor) driver).executeScript(
            "document.querySelectorAll('iframe, #fixedban, .advertisement').forEach(el => el.remove());"
        );
    }

    public void clickHomeCheckbox() {
        wait.until(ExpectedConditions.presenceOfElementLocated(homeText));

        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView({block:'center'});",
            driver.findElement(homeText)
        );

        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].click();",
            driver.findElement(homeText)
        );
    }

    public boolean isHomeSelected() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(checkedIcon)).isDisplayed();
    }
}