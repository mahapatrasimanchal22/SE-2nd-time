package switchwindow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		Set<String> set=driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<>(set);
		
		driver.switchTo().window(arr.get(2));
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		

	}

}
