package POPUP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadpopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","S:\\SESW\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("(//label[@title='Upload your CV to Register'])[1]")).click();
		
		StringSelection file=new StringSelection("C:\\Users\\LAXMI\\Desktop\\Simanchal Mahapatra Resume.docx");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_V);
		
		for(int i=0;i<2;i++){
			r.keyPress(KeyEvent.VK_TAB);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

}
