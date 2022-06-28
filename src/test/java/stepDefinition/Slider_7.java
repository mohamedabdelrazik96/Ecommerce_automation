package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.SliderPage.*;

public class Slider_7 {
    @When("click on first slider")
    public void first_slider()  {
        firstSlider().click();



        }
        @Then("relative product for first slider")
                public void first_Slider() throws InterruptedException {
            Thread.sleep(2000);
            Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
        }
    @When("click on second slider")
    public void second_slider()  {
        sliderSlider().click();



    }
    @Then("relative product for second slider")
    public void second_Slider() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demoo.nopcommerce.com/iphon_s6");
    }






        }






