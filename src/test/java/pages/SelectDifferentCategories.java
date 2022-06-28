package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;



public class SelectDifferentCategories {


public static WebElement mainMenu() {
    return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
}

    public static WebElement subMenu() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/software\"]"));
    }
    }
