package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class RestPasswordPage {
    public static WebElement ForgetPassword() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

    public static WebElement RecoverButton() {
        return Hooks.driver.findElement((By.cssSelector("button[class=\"button-1 password-recovery-button\"]")));
    }

    public static WebElement messageOfRecover() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
    public static WebElement closeMessage() {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }

}
