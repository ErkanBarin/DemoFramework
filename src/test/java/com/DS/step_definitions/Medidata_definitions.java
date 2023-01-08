package com.DS.step_definitions;

import com.DS.pages.HomePage;
import com.DS.pages.Trial_Products;
import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;

public class Medidata_definitions extends HomePage {

    JavascriptExecutor js=(JavascriptExecutor)Driver.get();

    @Given("the client is on homepage")
    public void the_client_is_on_homepage() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        cookie.click();


    }
    @When("the client scrolls down")
    public void the_client_scrolls_down() {
        js.executeScript("arguments[0].scrollIntoView(true)",createSolutions);
    }
    @And("clicks on SEE HOW WE CREATE SOLUTIONS FOR OUR CLIENTS page")
    public void clicks_on_see_how_we_create_solutions_for_our_clients_page() {

        js.executeScript("arguments[0].click()",createSolutions);

        }


    @Then("clicks on View Fact Sheet")
    public void clicks_on_view_fact_sheet() {
        Trial_Products trial_products= new Trial_Products();
        trial_products.factSheet.click();
        System.out.println(Driver.get().getTitle());

    }


}
