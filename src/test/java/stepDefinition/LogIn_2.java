package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LogInPage;

import static pages.LogInPage.*;
import static stepDefinition.Reg_1.*;

public class LogIn_2 {
    @Given("user navigates to login page")
    public void openLoginPage(){
        clickLoginButt().click();

    }
    @When("user can login with valid data")
    public void loginWithValidData(){
        EmailAddress().sendKeys(email);
        PasswordAddress().sendKeys(password);

    }
    @Then("user can login successfully")
    public void clickLoginButton(){
        LogInPage.clickLogin().click();
    }
    @And("home page is opened")
    public void openHomePage(){
        Assert.assertTrue(MyAccount().isDisplayed());


    }
}
