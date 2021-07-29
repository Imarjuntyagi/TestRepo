package couponTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.Test;

public class ONETest {

	@Test
	public void methodname() throws InterruptedException {

		int n = 8;

		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 9) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();

		// Get and display the alphanumeric string

		System.setProperty("webdriver.chrome.driver",
				"/home/arjun/eclipse-workspace/Admincode/Chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.mykirana.com/admin/index.php?route=common/login/employee");
		driver.findElement(By.xpath("//input[@placeholder='Username / Email']"))
				.sendKeys("hasibur.rahman@kartrocket.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("hasibur@123");
		driver.findElement(By.xpath("//button[@id='login-btn']")).click();
		driver.findElement(By.xpath("//button[@onclick=\"login('admin')\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Coupons')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Manage Coupons')]")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//li/a[contains(text(),'Create Coupon')]")).click();
//
//		driver.findElement(By.xpath("//form/div/div/fieldset/div[1]/div/select"));
//		driver.findElement(By.xpath("//div/div/fieldset/div[2]/div/input")).sendKeys("Automatedcoupon");
//		driver.findElement(By.xpath("//div/div/fieldset/div[3]/div/input")).sendKeys(saltStr);
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//input[@name='app']")).click();
//
//		driver.findElement(By.xpath("//option[@value='F']")).click(); // used to select fixed amount from drop down
//		driver.findElement(By.xpath("//input[@type='text' and @name='discount']")).sendKeys("10");
//		driver.findElement(By.xpath("//input[@type='text' and @name='total']")).sendKeys("50");
//		driver.findElement(By.xpath("//div/div/fieldset/div[22]/div/a[1]")).click();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//input[@name='uses_total']")).clear();
//		driver.findElement(By.xpath("//input[@name='uses_total']")).sendKeys("10");
//		driver.findElement(By.xpath("//input[@name='uses_customer']")).clear();
//
//		driver.findElement(By.xpath("//input[@name='uses_customer']")).sendKeys("10");
//
//		Thread.sleep(2000);
//
//		// #######################################################################
//
//		driver.findElement(By.xpath("//textarea[@name='description']"))
//				.sendKeys("This coupon code is generated for testing ");
//
//		driver.findElement(By.xpath("//input[@name='retailer_coupon_usage_flag']")).sendKeys("1");
//		driver.findElement(By.xpath("//input[@name='uses_per_customer_flag']")).sendKeys("1");
//		driver.findElement(By.xpath("//input[@name='uses_per_device_cap']")).sendKeys("1");
//		driver.findElement(By.xpath("//input[@name='uses_per_device_flag']")).sendKeys("1");
//
//		driver.findElement(By.xpath("//input[@name='uses_per_whitelisted_cap']")).sendKeys("1");
//
//		driver.findElement(By.xpath("//input[@name='uses_per_whitelisted_flag']")).sendKeys("1");
//		Thread.sleep(2000);
//
////       
//		driver.findElement(By.xpath("//img[@style='display: block; height: 50px; width:50px; ']")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//*[@id=\"page-content\"]/div[2]/article/header/ul/li[1]/a")).click();
//		System.out.println("New Coupon created successfully with code:" + saltStr);

		driver.findElement(By.xpath("//span[@class='fa fa-wrench']")).click();
		Thread.sleep(1000);
		System.out.println("B4 refresh");

		driver.navigate().refresh();
		System.out.println("After refresh ");

		System.out.println("will click on import button");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/article/header/ul/li[1]/a")).click();
		System.out.println("after click on import button");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='file_retailercoupon']")).click();

		driver.findElement(By.xpath("//input[@type='file' and @name='file_retailercoupon']"));
	//	String filepath = "/home/arjun/eclipse-workspace/CouponCode/inputfiles/KartRocket_Promotions_Retail (16).csv";

		//driver.findElement(By.xpath("//button[@class='btn btn-default'][2]")).click();
	}

}
