package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver = null;

	By User_name = By.xpath("//*[@id=\\\"icon\\\"]");
	By PassWord = By.xpath("//input[@placeholder='Password']");
	By submit_button = By.xpath("//button[@id='login-btn']");

	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterusername(String Text) {
		driver.findElement(User_name).sendKeys(Text);
	}

	public void enterpassword(String Text) {
		driver.findElement(PassWord).sendKeys(Text);
	}

	public void clickonsumbit(String Text) {
		driver.findElement(submit_button).click();
	}
}
