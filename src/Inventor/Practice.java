package Inventor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
	
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.jio.com/welcome");
		driver.findElement(By.xpath("(//a[.='Explore'])[2]")).click();
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
		WebElement num =driver.findElement(By.xpath("(//td[@class='title text-center'])[5]/../..//td[.='1800-893-3399']"));
		
		System.out.println(num.getText());
	}

}
