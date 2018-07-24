package SendmeldingTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
public class InitBrowser {
	
	public static RemoteWebDriver driver;
	public static EventFiringWebDriver eventDriver;
	public static WebDriver initBrowser()
	    {
			
		try{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\amutha.chellappa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			Capabilities chromeCapabilities = DesiredCapabilities.chrome();
			//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);
			// Create a new instance of the Chrome driver
			
			driver = new ChromeDriver();
			eventDriver = new EventFiringWebDriver(driver);
			
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
		    }catch(Exception E)

		    {
		        E.printStackTrace();


		    }
		Log.info("Init Browser OK");
		return driver;	

		
		}
}
