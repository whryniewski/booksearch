package pl.whr.booksearch.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import pl.whr.booksearch.Application;
import pl.whr.booksearch.model.Offer;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = Application.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class BackendControllerTest {

	@LocalServerPort
	private int port;

	@Before
    public void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    @Test
	public void nothing() {
		assert(true);
	}

	@Test
	public void returnsSomething() {
		JsonPath path = given().queryParam("title", "spring")
		.when()
			.post("/api/search").prettyPeek()

		.then()
			.statusCode(201)
			.assertThat()
				.contentType(ContentType.JSON)
				.extract().body().jsonPath();

		List<Offer> offers = path.getList("", Offer.class);
		assertThat("There should be many offers for Spring books",offers.size() > 0);
	}
}
