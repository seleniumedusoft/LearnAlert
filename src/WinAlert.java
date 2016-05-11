
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WinAlert {
	
	public static void main(String[] args) throws AWTException, InterruptedException{
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://encodable.com/uploaddemo/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		//click on upload
		driver.findElement(By.id("uploadname1")).click();
		
		Thread.sleep(2000);
		// creating instance of Robot class (A java based utility)
		Robot robot =new Robot();
		
		// pressing keys with the help of keyPress and keyRelease events
		String text = "C:\\automation\\Grid\\New Text Document.txt";
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);

		//ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		
//		driver.findElement(By.id("uploadbutton")).click();
		
		/*
		 * 
		 */
		
		
		
	}

}
