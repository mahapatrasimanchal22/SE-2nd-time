package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mahapatrasimanchal22@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9124749989");
		
	}

}
