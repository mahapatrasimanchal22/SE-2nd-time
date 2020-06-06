package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class As10 {

	public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	WebElement day =driver.findElement(By.id("day"));
	
	Select sel=new Select(day);
	sel.selectByIndex(25);
	Thread.sleep(3000);
	//day.sendKeys(Keys.TAB);
	WebElement mon = driver.findElement(By.id("month"));
	
	Select sel1=new Select(mon);
	sel1.selectByValue("3");
	Thread.sleep(3000);
	//mon.sendKeys(Keys.TAB);
	
	WebElement year =driver.findElement(By.id("year"));
	

	Select sel2=new Select(year);
	sel2.selectByVisibleText("2016");
	
	
	
	
	
	
	}
	


}

