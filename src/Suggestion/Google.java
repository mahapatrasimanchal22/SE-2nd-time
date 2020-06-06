package Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Google {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> auto =driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(auto.size());
		
		for(int i=0;i<auto.size();i++){
			System.out.println(auto.get(i).getText());
		}
		
		auto.get(4).click();
		
	}

}
