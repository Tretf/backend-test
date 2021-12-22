package com.geekbrains.backend.test.imgur;

import com.geekbrains.backend.test.FunctionalTest;
import com.geekbrains.backend.test.Imgur.ImgurApiAbstractTest;
import io.restassured.RestAssured;
import io.restassured.authentication.OAuth2Scheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.internal.AuthenticationSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.util.Properties;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class ImgurAoiFunctionalTest extends FunctionalTest {
public class ImgurAoiFunctionalTest extends ImgurApiAbstractTest {

////    private static Properties properties;
////    public static String TOKEN;
//    private static String CURRENT_IMAGE_ID;
////    private static AuthenticationSpecification auth;
////    private static RequestSpecification requestSpecification;
//
////        Сравнители
////        Matchers.is()
////        Matchers.not()
////        Matchers.equalTo()
////        Matchers.nullValue()
////        Matchers.notNullValue()
//
////    @BeforeAll
////    static void beforeAll() throws Exception {
////        properties = readProperties();
////        RestAssured.baseURI = properties.getProperty("imgur-api-url");
////        TOKEN = properties.getProperty("imgur-api-token");
////        requestSpecification = new RequestSpecBuilder()
////                .setAuth(new OAuth2Scheme())
////                .build();
////        //AuthenticationSpecification auth = new AuthenticationSpecificationImpl(requestSpecification);
////        auth = new AuthenticationSpecificationImpl(requestSpecification);
////        requestSpecification = auth.oauth2(TOKEN);
////        auth.oauth2(TOKEN);
////   }
//
//    @Test
//    @Order(1)
//    void getAccountBase() {
//        String userName = "tretf";
//
////        RequestSpecification req = new RequestSpecBuilder()
////                .build();
////
////        ResponseSpecification resp = new ResponseSpecBuilder()
////                .build();
//
//        given()
////                .auth()
////                .oauth2(TOKEN)
////                //.oauth2(properties.getProperty("imgur-api-token"))
////                .spec(req)
//                .spec(requestSpecification)
//                .log()
//                .all()
//                .expect()
////                .spec(resp)
//                .body("data.id", is(157887753))
//                .log()
//                .all()
//                .when()
//                .get("account/" + userName);
//
//    }
//
//    @Test
//    @Order(2)
//    public void postImageTest() {
//
//
////        String imageID = given()
//        CURRENT_IMAGE_ID = given()
////                .auth()
////                .oauth2(TOKEN)
//                .spec(requestSpecification)
//
//                .multiPart("image", getFileResource("depositphotos_107694484-stock-photo-little-boy.jpg"))
//                //.multiPart("image", "F:\\IT\\D\\%d0%94%d0%be%d0%ba%d1%83%d0%bc%d0%b5%d0%bd%d1%82%d1%8b\\%d0%a2%d1%80%d0%b5%d1%89%d0%b5%d0%b2%d0%b0\\%d0%a1%d0%b0%d0%b9%d1%82\\backend\\backend-test\\target\\test-classes\\com\\geekbrains\\backend\\test\\Imgur\\ImgurAoiFunctionalTest\\depositphotos_107694484-stock-photo-little-boy.jpg")
//                .formParam("name", "Picture")
//                .formParam("title", "The best picture!")
//                .log()
//                .all()
//                .expect()
//                .body("data.size", is(33960))
//                .body("data.type", is("image/jpeg"))
//                .body("data.name", is("Picture"))
//                .body("data.title", is("The best picture!"))
//                .log()
//                .all()
//                .when()
//                .post("upload")
//                //.post("image");
//                .body()
//                .jsonPath()
//                .getString("data.id");
////        CURRENT_IMAGE_ID = imageID;
//
//    }
//
//
//    @Test
//    @Order(3)
//    void deleteImageById() {
//        given()
////                .auth()
////                .oauth2(TOKEN)
//                .spec(requestSpecification)
//
//                .log()
//                .all()
//                .expect()
//                .body("status", is(200))
//                .log()
//                .all()
//                .when()
//                .delete("image/" + CURRENT_IMAGE_ID)
//                ;
//    }
//
//    @Test
//    @Order(4)
//    void getImage() {
//        String userName = "tretf";
//        given()
////                .auth()
////                .oauth2(TOKEN)
//                .spec(requestSpecification)
//
//                //.headers()
//                .expect()
//               //.body("data.id", is("1dQQqk7"))
//                .log()
//                .all()
//                .when()
//                .get("account/" + userName)
//                .then()
//                .statusCode(200);
//    }
//
//
//  /*  @Test
//    void deleteImage() {
//        given()
//                .headers()
//                .expect()
//                .body("mageDeleteHash", is("AQZDkDIurHwEIjZ"))
//                .body("success", is(true))
//                .body("data", is(true))
//                .log()
//                .all()
//                .when()
//                .delete()
//                .then()
//                .statusCode(200);
//    }*/
//
//
//    @Test
//    @Order(5)
//    void createComment() {
//        given()
//                .spec(requestSpecification)
//                .formParam("image_id", "DEEPgrP")
//                .formParam("comment", "Hello world!")
//                .log()
//                .all()
//                .expect()
//                .body("success", is(true))
//                .body("status", is(200))
//                .log()
//                .all()
//                .when()
//                .post("comment")
//                .then()
//                .statusCode(200)
//
//                ;
//
//    }
//
//    @Test
//    @Order(6)
//    void getComment() {
//        String userName = "tretf";
//        given()
//                .spec(requestSpecification)
//                .formParam("commentId","2172831152")
//                .log()
//                .all()
//                .expect()
//                .body("status", is(200))
//                .body("success", is(true))
//                .log()
//                .all()
//                .when()
//                .get("account/" + userName);
//
//    }
//
//
//    @Test
//    @Order(7)
//    void deleteCommentById() {
//        given()
////                .auth()
////                .oauth2(TOKEN)
//                .spec(requestSpecification)
//
//                .log()
//                .all()
//                .expect()
//                .body("status", is(200))
//                .log()
//                .all()
//                .when()
//                .delete("comment/" + "2172831152")
//
//        ;
//    }


}