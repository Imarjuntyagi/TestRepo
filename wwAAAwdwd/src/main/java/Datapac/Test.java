package Datapac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/home/arjun/eclipse-workspace/Admincode/Chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://staging_hul.kartrocket.co/admin/index.php?route=common/login");
		// driver.findElement(By.xpath("//input[@placeholder='Username /
		// Email']")).sendKeys("gargee.bhandari@kartrocket.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gargee.bhandari@kartrocket.com");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");

		boolean aa = driver.findElement(By.xpath("//input[@name='recaptcha_response']")).isDisplayed();
		System.out.println(aa);

		driver.findElement(By.xpath("//button[@id='login-btn']")).click();
		driver.findElement(By.xpath("//button[@onclick=\"login('admin')\"]")).click();
	}
}
