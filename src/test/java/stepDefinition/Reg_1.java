package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


import static pages.RegPage.*;


public class Reg_1 {
    public static String email = "mohamed2020@gmail.com";
    public static String password = "1234516789";
    public static String firstName = "mohamed";
    public static String lastName = "abdo";

    @Given("user open the registration page")
    public void goToUrl(){
        register().click();
    }
    @When("user enter valid data")
    public void enterValidData(){
        genderMale().click();
        firstName().sendKeys(firstName);
        lastName().sendKeys(lastName);
        dateOfBirthDay();
        dateOfBirthMonth();
        dateOfBirthYear();
        emailAddress().sendKeys(email);
        enterPassword().sendKeys(password);
        enterConfirmPassword().sendKeys(password);

    }
    @And("user click registration button")
    public void clickRegistrationButton(){
        clickRegisterButton().click();
    }
    @Then("verify message is displayed")
    public void messageIsDisplayed(){
        String expectedResult = "Your registration completed";
        Assert.assertTrue(message().getText().contains(expectedResult), "Error Message: User couldn't register successfully");

    }
    @And("user click log out")
    public void clickLogOut(){
        clickLogoutButton().click();
    }

}
