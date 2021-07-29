package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.junit.runner.Request;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_002_Keydeletion {

	@Test
	void Keydeletion()

	{

		RequestSpecification request = RestAssured.given();

		JSONObject json = new JSONObject();
		json.put("prefix", "app_banners_new_v2");
		json.put("vendor_id", "44");
		json.put("delete_keys_2021-04-01", true);
		request.body(json.toJSONString());
		Response response = request.post(
				"https://staging_hul.kartrocket.co/index.php?route=feed/api/v1/extra/redisKeyOperations&key=98f13708210194c475687be6106a3b99");

		System.out.println(response.asString());
		
	//	System.out.println("Keys deleted succceffully");


	}

}
