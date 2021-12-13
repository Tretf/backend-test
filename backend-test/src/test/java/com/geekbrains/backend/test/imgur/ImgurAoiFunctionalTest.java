package com.geekbrains.backend.test.imgur;

import com.geekbrains.backend.test.FunctionalTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Properties;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.is;

public class ImgurAoiFunctionalTest extends FunctionalTest {
    private static String CURRENT_IMAGE_ID;

    private static Properties properties;
    public static String TOKEN;

    @BeforeAll
    static void beforeAll() throws Exception {
        properties = readProperties();
        RestAssured.baseURI = properties.getProperty("imgur-api-url");
        TOKEN = properties.getProperty("imgur-api-token");
    }

    @Test
        //@Order(1)
    void getAccountBase() {
        String userName = "tretf";
        given()
                .auth()
                .oauth2(properties.getProperty(TOKEN))
                //.spec(requestSpecification)
                .log()
                .all()
                .expect()
                .body("data.id", is(157887753))
                .log()
                .all()
                .when()
                .get("account/" + userName);

    }

    @Test
    public void postImageTest() {
        CURRENT_IMAGE_ID = given()
                .spec(requestSpecification)
                .multiPart("image", getFileResource("depositphotos_107694484-stock-photo-little-boy.jpg"))
                .formParam("name", "Picture")
                .formParam("title", "The best picture!")
                .log()
                .all()
                .expect()
                .body("data.size", is(33960))
                .body("data.type", is("image/jpeg"))
                .body("data.name", is("Picture"))
                .body("data.title", is("The best picture!"))
                .log()
                .all()
                .when()
                .post("upload")
                .body()
                .jsonPath()
                .getString("data.id");

    }

    @Test
    void getImage() {
        String userName = "tretf";
        given()
                .headers()
                .expect()
                .body("data.id", is("1dQQqk7"))
                .log()
                .all()
                .when()
                .get("account/" + userName)
                .then()
                .statusCode(200);
    }

    @Test
    void getComment() {
        String userName = "tretf";
        given()
                .headers()
                .expect()
                .body("commentId", is("2435859"))
                .body("success", is(true))
                .log()
                .all()
                .when()
                .get("account/" + userName)
                .then()
                .statusCode(200);
    }

    @Test
    void deleteImage() {
        given()
                .headers()
                .expect()
                .body("mageDeleteHash", is("AQZDkDIurHwEIjZ"))
                .body("success", is(true))
                .body("data", is(true))
                .log()
                .all()
                .when()
                .delete()
                .then()
                .statusCode(200);
    }


}