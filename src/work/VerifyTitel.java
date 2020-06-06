package work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\SESW\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
			String tit =driver.getTitle();
		if(tit.equalsIgnoreCase(tit)){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}

			
	}

}
