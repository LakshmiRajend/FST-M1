import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class gitHub {

	final static String ROOT_URI = "https://api.github.com";
	String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCxKdNz1FrsGlZQtoZwFHqSfZN4tIpbUkxVm/FtlSJWsEJUUG61bos/uZpvw375+hvVceLhQIV5BxmakHvccnbNxDSyIQWsUrShpch7z5uE873SFa3vEycFdYzj0g3aqzxCkn5SQdc0Bw11g3NH52I5KE09CvszsTIPwrV/jvoTVBIp/ZroLVbTHPqs4s6IuGi8CEtivmYcjRUFKlSxhC1aLo7P0bXmoYqKubaQUc0wNqKuOOI4+lGYv7m4L1LbEnsuJJd/FGaAVHk/8dbnm8Y9GgAfvOrwS2R9CcL7BHeD3YTeBrjaRdIFuv/OndP4Lbsu+P0jknm/OMiMJNHgp5CNznZYQLvROBxSoE3xOX4FzFcvprpBlruCHRK6Bk172mbvdopEjLGTQK6+PRPKeu4tcYllzJRSnUf1z9UgvdVq1KrwDzC4sDk6aylbgRBQWG654HzMpPQg0RXruSOPjllBKkD0hJHIkXpyLaRZJtoBerVGVfMvyxa5HzpUp36rP1k=";
	int idOfKey;
	String tokenValue = "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";
	RequestSpecification reqSpec;

	@BeforeClass

	public void setUp() {
		// Create request specification

		reqSpec = new RequestSpecBuilder()
				.setContentType(ContentType.JSON)
				.addHeader("Authorization", "token " + tokenValue)
				.setBaseUri(ROOT_URI).build();
	}

	@Test(priority = 1)
	public void addSSHKey() {
		String reqBody = "{\"title\": \"TestAPIKey\",\"key\": \"" + sshKey + "\"}";
		Response response =given().spec(reqSpec)
				.contentType(ContentType.JSON)
				.body(reqBody) // Add request body
				.when().post("/user/keys");
		String res = response.getBody().asPrettyString();
		System.out.println("===== Response body is " + res);

		idOfKey= response.then().extract().path("id");
		System.out.println("====ID of key is "+idOfKey);
		
		
//        response.then().body("code",equalTo(201));
		response.then().statusCode(201);
	}
	@Test(priority=2)
	public void getSSHKey() {
		
		Response response =given().spec(reqSpec)
				.contentType(ContentType.JSON) 
				.when().get("/user/keys");
		//Logging response to console
		String res = response.getBody().asPrettyString();
		System.out.println("===== Response body for GET Method is " + res);
        //Assert status code is 200
		response.then().statusCode(200);
	}
	@Test(priority=3)
	public void deleteSSHKey() {
		
		String deleteURI = "/user/keys/{keyId}";
		Response response =given().spec(reqSpec)
				.contentType(ContentType.JSON)
				.when().pathParam("keyId", idOfKey)
				.delete(ROOT_URI+deleteURI);
		System.out.println("==== Response of delete request :"+response.asPrettyString());
		//Assert status code is 204
		response.then().statusCode(204);

		
	}
		
}