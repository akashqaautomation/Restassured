package sample;

import org.testng.annotations.Test;
import java.util.ArrayList;
import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

import io.restassured.RestAssured;

public class TestClass {
	@Test
	public static void getResponseStatus(){
		   int statusCode= given().queryParam("CUSTOMER_ID","68195")
		           .queryParam("PASSWORD","1234!")
		           .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		   System.out.println("The response status is "+statusCode);

		   given().when().get("http://demo.guru99.com/V4/sinkministatement.php").then().assertThat().statusCode(200);
		}

}
