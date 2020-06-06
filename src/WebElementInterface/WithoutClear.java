package WebElementInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WithoutClear {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("(//a[@ga-event-action='sign in'])[2]")).click();		
		//Thread.sleep(3000);
		WebElement	name =driver.findElement(By.xpath("//input[@type='email']"));
		Thread.sleep(3000);
		name.sendKeys("mahapatrasimanchal22@gmail.com");
		//name.sendKeys(Keys.ARROW_LEFT);
		for(int i=0;i<=5;i++){
			name.sendKeys(Keys.ARROW_LEFT);
		}
		for(int i=0;i<=23;i++){
		
			name.sendKeys(Keys.BACK_SPACE);
		}
		
	}

}
