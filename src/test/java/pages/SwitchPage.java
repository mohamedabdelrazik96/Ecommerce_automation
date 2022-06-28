package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.Hooks;

import static stepDefinition.Hooks.*;


public class SwitchPage {

    public static WebElement selectEuro() {

       return Hooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]"));


    }



    public static WebElement assertPrice() {

        scrollToElle();
        return  Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span"));
    }
}

