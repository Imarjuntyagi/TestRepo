package PromoTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class clone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/arjun/eclipse-workspace/Admincode/Chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://hulstaging.kartrocket.co/admin/index.php?route=common/login/employee");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"icon\"]"));

		Assert.assertTrue(element.isDisplayed());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"icon\"]")).sendKeys("dhruv.sharma");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("dhruv123");
		driver.findElement(By.xpath("//button[@id='login-btn']")).click();

		driver.findElement(By.xpath("//button[@onclick=\"login('admin')\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Store Design')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Banner Slideshow')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Update Slider Images & Text')]")).click();
		driver.findElement(By.xpath("//a[@id='banner_import']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file' and @name='import']")).click();
	}
}
