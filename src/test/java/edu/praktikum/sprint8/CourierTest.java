package edu.praktikum.sprint8;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CourierTest {

    @Test
    public void test() {
        Courier courier = null;

        given().baseUri("")
                .header("Content-type", "application/json")
                .body(courier)
                .post("/api/v1/courier")
                .prettyPrint();
    }
}
