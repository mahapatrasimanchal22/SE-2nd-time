package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login ']")).click();
	}

}
