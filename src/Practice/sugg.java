package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class sugg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();													
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("simanchal");
		Thread.sleep(3000);
	List<WebElement> auto	= driver.findElements(By.xpath("//span[contains(text(),'simanchal')]"));
	Thread.sleep(3000);
	System.out.println(auto.size());
	
	for(int i=0;i<auto.size();i++){
		System.out.println(auto.get(i).getText());
	}
	
	auto.get(3).click();
	
	
	
	}

}
