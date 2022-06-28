package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static pages.SelectDifferentCategories.*;
import static stepDefinition.Hooks.driver;

public class SelectDifferentCategories_5 {
    SoftAssert Assert = new SoftAssert();
    @Given("select random category")
    public void select_random_category() {
        Actions action = new Actions(driver);
        action.moveToElement(mainMenu());
        action.moveToElement(subMenu());

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        action.click().build().perform();
    }

    @Then("user should redirected to the page of the selected category")
    public void selectedCategory() {
        String expectedUrl = "https://demo.nopcommerce.com/software";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Wrong Page");
        Assert.assertAll();
    }

}
