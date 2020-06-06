package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class Checkpresent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
	WebElement	list =driver.findElement(By.id("month"));
		
			Select sel=new Select(list);
			List<WebElement> op =sel.getOptions();

			System.out.println(op.size());
			
			
	}

}
