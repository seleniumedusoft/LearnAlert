import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JsAlerts {

	 public static void main(String[] args) throws InterruptedException {

	  WebDriver driver = new ChromeDriver();
	  
	//  driver.navigate().to("file://C:/automation/Eclipse_MVN_WS/LearnAlerts/JSAlerts.html");
	  
	  //this site has iframe
	  driver.navigate().to("http://w3schools.com/js/tryit.asp?filename=tryjs_prompt");

	  driver.switchTo().frame(driver.findElement(By.id("iframewrapper")));
	  

	  Thread.sleep(2000);
	  WebElement element = driver.findElement(By.tagName("button"));
	  element.click();

	  Alert alert = driver.switchTo().alert();

	  alert.sendKeys("Selenium");
	  System.out.println(alert.getText());
	  Thread.sleep(5000);
	  alert.accept();
	  
	  

	 }
}
