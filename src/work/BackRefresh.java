package work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackRefresh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
	}
	
	

}
