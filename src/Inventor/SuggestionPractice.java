package Inventor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class SuggestionPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("simanchal");
		
	List<WebElement>	sugg1 =driver.findElements(By.xpath("//strong[.='seemanchal']"));
	
	List<WebElement> 	sugg2	=driver.findElements(By.xpath("//span[contains(text(),'simanchal')]"));
		
	List<WebElement>	sugg3 =driver.findElements(By.xpath("//strong[.='simhachalam']"));
	
	
	System.out.println(sugg1.size());
	System.out.println(sugg2.size());
	System.out.println(sugg3.size());
	
	for(int i=0;i<sugg1.size();i++){
		System.out.println(sugg1.get(i).getText());
	}
	
	
	//IN SAME PROCCESS NEXT 2 SUGGESTION PART
	
	}

}
