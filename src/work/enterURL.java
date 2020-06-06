package work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enterURL {

	public static void main(String[] args){
		
	System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver drive=new ChromeDriver();
	
	drive.get("https://www.facebook.com/");
	
	drive.navigate().to("https://www.google.com/");
	}
}
