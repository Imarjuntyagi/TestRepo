package Datapac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovoder

{
	@DataProvider(name = "xx")

	public Object[][] getdate() {
		Object[][] ret = new Object[2][1];

		ret[0][0] = "Arjun";
		ret[1][0] = "Tyagi";


		return ret;

	}

	@Test(dataProvider = "xx")
	public void kk(String aa) {

		System.out.println("name is "+aa);
	}

}
