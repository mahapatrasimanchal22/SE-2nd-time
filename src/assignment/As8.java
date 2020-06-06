package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class As8 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://filehippo.com/");
		driver.findElement(By.xpath("//a[.='Popular software']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='uTorrent']//./../../../..//span[.='Download']")).click();
		
		

	}

}
