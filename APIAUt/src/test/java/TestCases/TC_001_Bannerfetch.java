package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_001_Bannerfetch {

	@Test

	public void Bannerfetch()

	{

Response response = RestAssured.get(
			"https://hulstaging.kartrocket.co/index.php?route=feed/api/v1/extra/getHomepageBanners&vendor_id=44&key=98f13708210194c475687be6106a3b99&page=1");

	System.out.println(response.asString());
		
		
		

	}

}
