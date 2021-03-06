package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.FollowUsPage;

import java.util.ArrayList;

import static pages.FollowUsPage.*;
import static stepDefinition.Hooks.driver;

public class FollowUsStepDef_6 {
    ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    @Given("user click face link")
    public void goToLink() throws InterruptedException {
        openFacebook().click();
        Thread.sleep(3000);
       Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
    }

    @And("user open facebook")
    public void assertUrl(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }
    @Then("go to home page")
    public void goToHome() throws InterruptedException {


        Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(0));
        Thread.sleep(3000);
    }
    @Given("user click twitter icon link")
    public void goToTwitter() throws InterruptedException {
       FollowUsPage.openTwitter().click();
        Thread.sleep(3000);
        Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
    }

    @And("user go to twitter")
    public void assertTwitterUrl() throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

    }
    @Given("user click youtube link")
    public void goToYoutubeLink() throws InterruptedException {
        openYoutube() .click();
        Thread.sleep(3000);
        Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
    }
    @And("user open youtube")
    public void asserYoutubeUrl(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
    }
    @Given("user clicks rss link")
    public void goToRssLink() throws InterruptedException {
       openRss().click();
        Thread.sleep(3000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");

    }



}
