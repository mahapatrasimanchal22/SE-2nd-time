package POPUP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.RobotRetriever;

public class Downloadpopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		/*System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();*/
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://filehippo.com/");
		driver.findElement(By.xpath("//a[.='Popular software']")).click();
		driver.findElement(By.xpath("(//span[.='Download'])[1]")).click();
		driver.findElement(By.xpath("//a[@title='Download Latest Version']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='No thanks, continue to download uTorrent']")).click();

		Robot r=new Robot();
		for(int i=0;i<2;i++){
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
		}
	}

}
