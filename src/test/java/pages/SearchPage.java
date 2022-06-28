package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepDefinition.Hooks;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    public static WebElement clickOnSearch() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public static WebElement enterName () {
        return Hooks.driver.findElement(By.id("small-searchterms"));

    }

    public static WebElement clickSearch() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public static List<WebElement> relativeResult() {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
    }
    public static void countOfProducts() {
        int count = relativeResult().size();
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList<String> productList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.println(relativeResult().get(i).getText());
            productList.add(relativeResult().get(i).getText());
            Assert.assertTrue(relativeResult().get(i).getText().toUpperCase().contains("HTC"),
                    "Error Message: Product Not Found");
        }
        System.out.println(productList);

    }
}
