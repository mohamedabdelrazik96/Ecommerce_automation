package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class LogInPage {
    public static WebElement clickLoginButt() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public static WebElement EmailAddress() {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public static WebElement PasswordAddress() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public static WebElement clickLogin() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public static WebElement MyAccount() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

}
