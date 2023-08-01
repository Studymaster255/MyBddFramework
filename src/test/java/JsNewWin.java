import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsNewWin {

	public static void main(String[] args) {
WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		
//		js.executeScript("window.location='https://www.facebook.com';");
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		js.executeScript("window.open('https://www.google.com');");
		
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		//driver.get("https://www.google.com");
//		driver.navigate().to("https://www.google.com");
	}

}
