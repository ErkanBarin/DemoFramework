package com.DS.utilities;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class ApiBase {
    @BeforeAll
    public static void init(){
        RestAssured.baseURI="https://www.optumrx.com/public";

    }
}
