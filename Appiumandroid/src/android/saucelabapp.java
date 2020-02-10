package android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class saucelabapp {

	public static final String USERNAME = "nehakhanna1910";
	public static final String ACCESS_Key = "3094ae4d-3387-4618-93b1-844c42de5b64";
   public static final String URL = "http://"+USERNAME+":"+ACCESS_Key+"@ondemand.eu-central-1.saucelabs.com:80/wd/hub";
	
   public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("platform", "Android");
		caps.setCapability("platformversion", "6.0");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("name", "Nehatest");
		
		driver = new RemoteWebDriver(new URL(URL),caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://apsrtconline.in");
		driver.quit();
		
		
		
		

	}

}
