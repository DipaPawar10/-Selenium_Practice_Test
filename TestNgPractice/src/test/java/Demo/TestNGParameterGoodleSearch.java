package Demo;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGParameterGoodleSearch {
	
	@Test
	@Parameters({"Keyword"})
	public void googleSearch(String searchdata) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\Downloads\\\\drivers\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.sendKeys(searchdata);
		Assert.assertEquals(searchdata, searchbox.getAttribute("value"));
		
		driver.quit();		
		
	}

}
