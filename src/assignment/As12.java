package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class As12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	WebElement swi	= driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
	
	
		
		
		
	}

}
