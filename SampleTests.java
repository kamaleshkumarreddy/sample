import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SampleTests {
    @Test
    public void ShouldGetAllUsers(){
        // 1. Arrange
        // 2. Act
        // 3. Assert

        given()
                .when()
                        .get("https://gorest.co.in/public/v2/users")
                .then()
                .statusCode(200)
                .log().body();




        //Assert.assertEquals(1,1) ;
    }
}
