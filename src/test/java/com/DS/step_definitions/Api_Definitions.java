package com.DS.step_definitions;

import com.DS.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;



public class Api_Definitions {
    Response response;
    @Given("that I sent request to endpoint")
    public void thatISentRequestToEndpoint() {

       response=given().accept(ContentType.TEXT).when().get(ConfigurationReader.getProperty("apiUrlEnd"));
    }
    @When("assert some headers")
    public void assert_some_headers() {
        response.then().contentType("text/html; charset=UTF-8");

    }
    @Then("get status {int}")
    public void get_status(Integer int1) {
        response.then().statusCode(int1);


    }


}
