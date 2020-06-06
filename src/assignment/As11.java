package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class As11 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("//button[.='✕']")).click();
	WebElement	clk =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		clk.sendKeys("iphone xr 64gb");
		clk.sendKeys(Keys.ENTER);
		WebElement price =driver.findElement(By.xpath("//div[.='Apple iPhone XR (Yellow, 64 GB)']/../../..//div[contains(text(),'₹')]"));

		System.out.println(price.getText());
		
		
		
		
		
	}

}
