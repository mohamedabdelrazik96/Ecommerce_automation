package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

import static stepDefinition.Hooks.scrollDown;

public class FollowUsPage {
    public static WebElement openFacebook() {
        scrollDown();

        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));

    }

    public static WebElement openTwitter() {
        scrollDown();

        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));

    }

    public static WebElement openRss() {
        scrollDown();

        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));


    }
    public static WebElement openYoutube() {
        scrollDown();

        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));


    }
}