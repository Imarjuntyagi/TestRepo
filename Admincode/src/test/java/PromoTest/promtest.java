package PromoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class promtest {

	@Test

	public void prom() throws InterruptedException

	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("Promotion Creation",
				"This Test Case was excuted to create promotion on hul environemnt");
		test.pass("Test Case is staring now");

		System.setProperty("webdriver.chrome.driver",
				"/home/arjun/eclipse-workspace/Admincode/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hulstaging.kartrocket.co/admin/index.php?route=common/login/employee");
		test.pass("URL opened Successfully");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"icon\"]"));

		Assert.assertTrue(element.isDisplayed());

		driver.findElement(By.xpath("//*[@id=\"icon\"]")).sendKeys("dhruv.sharma");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("dhruv123");
		driver.findElement(By.xpath("//button[@id='login-btn']")).click();

		driver.findElement(By.xpath("//button[@onclick=\"login('admin')\"]")).click();
		test.pass("User is loggedin");

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/nav/div/ul/li[14]/a/span")).click();
		test.pass("Clicked on promotions");

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/article/header/ul/li[1]/a")).click();
		Thread.sleep(3000);
		test.pass("Clicked on Add new promotions");

		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[1]/div[1]/div/input[1]"))
				.sendKeys("60011912091790");
		Thread.sleep(3000);
		test.pass("SKU code Entered");

		driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
		test.pass("Product Selected from Search Sugestion");

		driver.findElement(By.xpath("//*[@id=\"claim_amount\"]")).sendKeys("10");
		Thread.sleep(1000);
		test.pass("Claim Amounted Entered");

		driver.findElement(By.xpath("//*[@id=\"non_claim_amount\"]")).sendKeys("10");
		test.pass("Non claim Amounted Entered");

		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[1]/div[5]/div/div/a[1]"))
				.click();
		Thread.sleep(1000);
		test.pass("All Customer group selected");

		driver.findElement(By.xpath("//*[@id=\"date-start\"]")).sendKeys("2021-01-12");
		test.pass("All Customer group selected");
		test.pass("Start Date Entered");

		Thread.sleep(1000);
		// driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[5]/div/textarea")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"date-end\"]")).sendKeys("2021-01-16");
		test.pass("End Date Entered");

		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[5]/div/textarea"))
				.sendKeys("Sample write up");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[6]/div/input"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[6]/div/input"))
				.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[7]/div/input"))
				.clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[7]/div/input"))
				.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[8]/div/input"))
				.clear();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[8]/div/input"))
				.sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[9]/div/input"))
				.clear();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[9]/div/input"))
				.sendKeys("2");
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[10]/div/input"))
				.clear();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[10]/div/input"))
				.sendKeys("2");
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[11]/div/input"))
				.clear();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[11]/div/input"))
				.sendKeys("2");
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[12]/div/input"))
				.clear();
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[3]/div[2]/article/section/div/form/div/div/div/div/div/div/div/div[12]/div/input"))
				.sendKeys("2");
		Thread.sleep(2000);
		test.pass("Values filled successfully");

		driver.findElement(By.xpath("//a[@class='scrollup']")).click();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/article/header/ul/li[1]/a"));

		Assert.assertTrue(element1.isDisplayed());
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/article/header/ul/li[1]/a")).click();
		test.pass("Clicked on Save Button after filling the form");

		extent.flush();
	}

}
