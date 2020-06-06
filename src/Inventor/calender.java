package Inventor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
		
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Thread.sleep(5000);
		from.click();
		Thread.sleep(10000);
		from.sendKeys("bbi");
		Thread.sleep(5000);
		from.sendKeys(Keys.ENTER);
		
		WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Thread.sleep(3000);
		to.click();
		to.click();
		Thread.sleep(5000);
		to.sendKeys("del");
		Thread.sleep(5000);
		to.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.xpath("//td[@title='Wednesday, 22 July 2020']")).click();
		driver.findElement(By.xpath("BE_flight_arrival_date")).click();
		driver.findElement(By.xpath("//td[@title='Wednesday, 22 July 2020']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='txt-ellipses flight_passengerBox travellerPaxBox']")).click();
	
		WebElement	clk =driver.findElement(By.xpath("(//span[@class='ddSpinnerPlus'])[1]"));

		Actions act=new Actions(driver);
		act.doubleClick();
	
		
	
	
	}
}