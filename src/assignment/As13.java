package assignment;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As13 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Set<String> set= driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<>(set);
		System.out.println(arr.size());
		driver.switchTo().window(arr.get(2));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//img[@src='https://company.naukri.com/popups/optum/2952020/optum-ns-250x250-2952020-11.gif']")).click();	
		Thread.sleep(3000);
		//System.out.println(driver.getCurrentUrl());
		Set<String> set1=driver.getWindowHandles();
		ArrayList<String> arr1=new ArrayList<>(set1);
		driver.switchTo().window(arr1.get(3));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(arr.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
