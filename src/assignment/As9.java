package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class As9 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amrihospitals.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://www.amrihospitals.in//sites/default/files/close-icon.png']")).click();
		driver.findElement(By.xpath("//a[.='Contact Us']")).click();	
		WebElement num =driver.findElement(By.xpath("//h2[.='Bangladesh']/..//b[contains(text(),'+880')]"));
		
		System.out.println(num.getText());
		
			
	}

}
