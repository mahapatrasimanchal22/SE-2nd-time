package Suggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Bing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.bing.com/");
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("babuni");
	List<WebElement>  sugg	=	driver.findElements(By.xpath("//span[contains(text(),'babuni')]"));
	Thread.sleep(4000);
		System.out.println(sugg.size());
	
	for(int i=0;i<sugg.size();i++){
		System.out.println(sugg.get(i).getText());
	
	}
	sugg.get(4).click();
	}

}
