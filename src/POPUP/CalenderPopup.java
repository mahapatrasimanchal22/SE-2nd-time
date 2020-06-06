package POPUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		
		WebElement from =driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		
		from.sendKeys("sfo");
		Thread.sleep(3000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		WebElement to	= driver.findElement(By.xpath("//input[@name='destination']"));
		to.sendKeys("san");
		Thread.sleep(3000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		WebElement adult =driver.findElement(By.xpath("//select[@name='adults']"));
		
		Select sel=new Select(adult);
		sel.selectByValue("2");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		for(int i=0;i<5;i++){ 
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		driver.findElement(By.xpath("(//a[.='22'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		for(int i=0;i<3;i++){
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
	
		driver.findElement(By.xpath("(//a[.='22'])[1]")).click();

		WebElement	clk =driver.findElement(By.xpath("//select[@name='children']"));
	
		Select sel1=new Select(clk);
			
		sel1.selectByValue("3");

		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		
	}

}
