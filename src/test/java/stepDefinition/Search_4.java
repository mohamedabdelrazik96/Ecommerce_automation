package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

import static pages.SearchPage.*;

public class Search_4 {
    static String productName = "HTC";

    @When("click on search field")
    public void LookingProduct(){
        clickOnSearch().click();

    }
    @And("searches with name of product")
    public void enterNameOfProduct(){
        enterName().sendKeys(productName);
        clickSearch().click();
    }
    @Then("find relative results")
    public void showProduct(){
        SearchPage.countOfProducts();

    }
}