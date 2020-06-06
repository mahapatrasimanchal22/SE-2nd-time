package HandelingMouseOperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		WebElement source =driver.findElement(By.xpath("//a[.='Women']"));

		WebElement	target =driver.findElement(By.xpath("//a[.='Kids']"));
	
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	
	}

}
