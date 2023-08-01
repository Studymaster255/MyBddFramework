package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver=null;
	public BaseClass()
	{
		final String PROPERTIES_FILE_PATH = "\\src\\main\\java\\ConfigLayer\\config.properties";

		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
					PROPERTIES_FILE_PATH);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initilization()
	{
		switch(prop.getProperty("browser"))
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("disable-infobars");
			options.addArguments("incognito");
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

}

/**
 * @AfterStep
	public void addScreenshot(Scenario scenario){
			final byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs 
					(OutputType. BYTES) ;
			// attach image file report(data, media type, name of the attachment)
			scenario.attach(screenshot,"image/png",scenario.getName());
			//log.info(scenario.getName());
	}
 */
