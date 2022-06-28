package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.LogInPage.clickLoginButt;
import static pages.RegPage.emailAddress;
import static pages.RestPasswordPage.*;
import static stepDefinition.Reg_1.email;

public class RestPassword_3 {
    @Given("clicks on forgot password")
    public void forgetPassword(){
        clickLoginButt().click();
        ForgetPassword().click();
    }
    @When("enter his valid email address")
    public void enterEmail(){
       emailAddress().sendKeys(email);

    }
    @And("click on recover button")
    public void clickRecoverButton(){
        RecoverButton().click();

    }
    @Then("user got a Displayed Message")
    public void showMessage(){
        Assert.assertTrue(messageOfRecover().isDisplayed());

    }
    @And("close the Notification Bar")
    public void closeMess(){
        closeMessage().click();





    }

}
