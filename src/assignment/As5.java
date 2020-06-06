package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class As5 {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32 81.0\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();*/
		WebDriver driver=new FirefoxDriver();
		

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mahapatrasimanchal22@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("babuhi");
		}

}
