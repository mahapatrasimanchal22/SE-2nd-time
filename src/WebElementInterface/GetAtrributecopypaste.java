package WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class GetAtrributecopypaste {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe" );
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement name =driver.findElement(By.id("email"));
		
		name.sendKeys("simanchal");
		
		String st= name.getAttribute("value");
		
		
		WebElement	pwd =driver.findElement(By.id("pass"));
		
		pwd.sendKeys(st);
		
		System.out.println(pwd.getAttribute("value"));
		
		
		
		
		

	}

}
