package HeadLessBrowserDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxHeadlessBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\geckodriver-v0.35.0-win64\\geckodriver.exee");
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.google.com/");
		System.out.println("Before Search:" + driver.getTitle());
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("India Gate");
		searchbox.sendKeys(Keys.ENTER);
		
		System.out.println("After Search:" + driver.getTitle());

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();

	}

}
