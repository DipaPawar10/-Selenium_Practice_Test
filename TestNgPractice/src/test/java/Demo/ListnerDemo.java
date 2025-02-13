package Demo;

import org.testng.SkipException;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

//@Listeners(Demo.ListnerClass.class)
public class ListnerDemo {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).submit();
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	@Test
	public void failTest() {
		System.out.println("Failed test Case");
		Assert.assertTrue(false);
		
	}
	@Test
	public void testSkipped() {
		System.out.println("Skipped Test Case");
		throw new SkipException("Skipped exception thrown");
		
		
	}
   
}
