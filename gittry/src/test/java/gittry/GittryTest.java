package gittry;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class GittryTest {
 
	WebDriver driver;
	@Test
	public void login() {
		String baseUrl = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		String text =driver.findElement(By.className("gNO89b")).getText();
		System.out.println(text);
	}
}
