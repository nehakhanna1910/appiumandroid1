package ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.ios.IOSDriver;

public class safariinIOS {
	

	public static final String USERNAME = "nehakhanna1910";
	public static final String ACCESS_Key = "3094ae4d-3387-4618-93b1-844c42de5b64";
   public static final String URL = "http://"+USERNAME+":"+ACCESS_Key+"@ondemand.eu-central-1.saucelabs.com:80/wd/hub";
   public static WebDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = DesiredCapabilities.iphone();
		caps.setCapability("appiumVersion", "1.12.1");
		caps.setCapability("deviceName", "iPhone 8 Simulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion", "12.2");
		caps.setCapability("name", "IOS App");
		caps.setCapability("platformName", "iOS");
		caps.setCapability("browserName", "Safari");
		
		WebDriver driver = new IOSDriver(new URL(URL),caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://apsrtconline.in");
		driver.findElement(By.id("fromPlaceName")).sendKeys("HYDERABAD");
		driver.findElement(By.id("toPlaceName")).sendKeys("CHANDIGARH");
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.xpath("//td[@data-month ='6' and @data-year ='2019']/a[text()='29']")).click();
		driver.findElement(By.id("searchBtn")).click();
		//By.xpath("//td")
		driver.quit();
		
	}
}