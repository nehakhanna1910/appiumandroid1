package ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class iosappinsaucelab {
	

	public static final String USERNAME = "nehakhanna1910";
	public static final String ACCESS_Key = "3094ae4d-3387-4618-93b1-844c42de5b64";
   public static final String URL = "http://"+USERNAME+":"+ACCESS_Key+"@ondemand.eu-central-1.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appiumVersion", "1.12.1");
		caps.setCapability("deviceName", "iPhone 8 Simulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion", "12.2");
		caps.setCapability("name", "IOS App");
		caps.setCapability("platformName", "iOS");
		String app= "https://github.com/saucelabs-sample-test-frameworks/Java-Junit-Appium-iOS/blob/master/resources/SauceGuineaPig-sim-debug.app.zip?raw=true";
	caps.setCapability("app", app);
	
	AppiumDriver driver = new IOSDriver(new URL(URL), caps);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(MobileBy.id("fbemail")).sendKeys("neha@k.com");
	
	MobileElement ele =(MobileElement) driver.findElement(MobileBy.id("comments"));
			ele.sendKeys("nehacomme");
	driver.findElement(MobileBy.id("h1Text")).click();
	driver.findElement(MobileBy.id("submit")).click();
	Thread.sleep(3000);
	 ele =(MobileElement) driver.findElement(MobileBy.id("submittedComments"));
	String output= ele.getText();
	Assert.assertEquals(output," ");
	
	
	driver.quit();
	
	/*IOSElement element = (IOSElement) driver.findElementByClassName("XCUIElementTypeKeyboard");
    Point keyboardPoint = element.getLocation();
    TouchAction touchAction = new TouchAction(driver);
    touchAction.tap(keyboardPoint.getX() + 2, keyboardPoint.getY() - 2).perform();
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }*/

	
	
	
	
	}

}
