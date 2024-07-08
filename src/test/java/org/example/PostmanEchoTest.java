package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import org.json.JSONObject;

public class PostmanEchoTest {

    private static final String url = "https://postman-echo.com";
    private static final int statusCode = 200;

    @Test
    public void getRequestTest(){
        Response response = given()
                .contentType(ContentType.JSON)
                .when().get(url + "/get?foo1=bar1")
                .then().log().body()
                .extract().response();
        String args = response.path("args.foo1");

        Assertions.assertAll(
                () -> Assertions.assertEquals(statusCode, response.getStatusCode()),
                () -> Assertions.assertEquals("bar1", args));
    }

    @Test
    public void postRawTextTest() {
        JSONObject requestBody = new JSONObject()
                .put("test", "value");

        Response response = given()
                .body(requestBody.toString())
                .when().post(url + "/post")
                .then().log().body()
                .extract().response();
        String data = response.path("data");

        Assertions.assertAll(
                () -> Assertions.assertEquals(statusCode, response.getStatusCode()),
                () -> Assertions.assertEquals(data, requestBody.toString()));
    }

    @Test
    public void postFromDataTest() {
        Response response = given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .when().post(url + "/post")
                .then().log().body()
                .extract().response();
        String form = response.path("form.foo1");

        Assertions.assertAll(
                () -> Assertions.assertEquals(statusCode, response.getStatusCode()),
                () -> Assertions.assertEquals("bar1", form));
    }

    @Test
    public void putRequestTest() {
        JSONObject requestBody = new JSONObject()
                .put("test", "value");

        Response response = given()
                .body(requestBody.toString())
                .when().put(url + "/put")
                .then().log().body()
                .extract().response();
        String data = response.path("data");

        Assertions.assertAll(
                () -> Assertions.assertEquals(statusCode, response.getStatusCode()),
                () -> Assertions.assertEquals(data, requestBody.toString()));
    }

    @Test
    public void patchRequestTest() {
        JSONObject requestBody = new JSONObject()
                .put("test", "value");

        Response response = given()
                .body(requestBody.toString())
                .when().patch(url + "/patch")
                .then().log().body()
                .extract().response();
        String data = response.path("data");

        Assertions.assertAll(
                () -> Assertions.assertEquals(statusCode, response.getStatusCode()),
                () -> Assertions.assertEquals(data, requestBody.toString()));
    }

    @Test
    public void deleteRequestTest() {
        JSONObject requestBody = new JSONObject()
                .put("test", "value");

        Response response = given()
                .body(requestBody.toString())
                .when().delete(url + "/delete")
                .then().log().body()
                .extract().response();
        String data = response.path("data");

        Assertions.assertAll(
                () -> Assertions.assertEquals(statusCode, response.getStatusCode()),
                () -> Assertions.assertEquals(data, requestBody.toString()));
    }
}