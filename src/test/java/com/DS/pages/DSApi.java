package com.DS.pages;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DSApi {
    @Test
    public void test1(){
        JsonPath jsonPath = given().when().get("https://www.medidata.com/").
                then().statusCode(200).extract().jsonPath();


    }

}
