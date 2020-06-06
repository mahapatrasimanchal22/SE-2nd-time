package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.qspiders.com/");
		driver.findElement(By.xpath("//a[.='Contact']")).click();
		WebElement num =driver.findElement(By.xpath("//a[.='Bhubaneswar ']/../../..//div[contains(text(),'+91')]"));
		
		System.out.println(num.getText());
	}

}
