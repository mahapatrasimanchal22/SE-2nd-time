package POPUP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class hiddenpopup {

	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2AkmmA _29YdH8')]")).click();
		
		WebElement ele =driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
		WebElement lap =driver.findElement(By.xpath("//a[@title='Laptops']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		//act.click(lap).perform();
		act.contextClick(lap).perform();
		Thread.sleep(3000);
		act.sendKeys("t").perform();
		
		
		
		
		
	}
}
